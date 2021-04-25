package hu.mobillab.stocksapp.data

import hu.mobillab.stocksapp.data.entity.SymbolEntity
import hu.mobillab.stocksapp.model.ChartData
import org.threeten.bp.ZonedDateTime
import javax.inject.Inject

class FinnhubRepository @Inject constructor(
    private val webservice: FinnhubApi,
    private val dao: FinnhubDao,
) {

    suspend fun fetchAll() {
        val symbols = dao.getAllSymbols()

        for (symbol in symbols) {
            val quote = webservice.quoteGet(symbol.ticker)
            symbol.current = quote.c
            symbol.open = quote.o
            symbol.high = quote.h
            symbol.low = quote.l
            symbol.close = quote.pc
            symbol.updatedAt = ZonedDateTime.now()

            dao.updateSymbol(symbol)
        }
    }

    suspend fun fetchChartData(symbol: String, from: Long, to: Long): ChartData {
        val symbolEntity = dao.findByTicker(symbol) ?: throw Exception("Not found")
        val chartData = webservice.stockCandleGet(
            symbol = symbolEntity.ticker,
            resolution = "15",
            from = from.toInt(),
            to = to.toInt()
        )

        if (chartData.t == null || chartData.t!!.isEmpty()) {
            throw Exception("Bad response")
        }

        return chartData
    }

    suspend fun getSymbols(): List<SymbolEntity> {
        return dao.getAllSymbols()
    }

    suspend fun addSymbol(symbol: String) {
        val companyProfile = webservice.stockProfile2Get(symbol)
        val ticker = companyProfile.ticker ?: throw Exception("No ticker in data")

        if (dao.findByTicker(companyProfile.ticker!!) != null) {
            throw Exception("Symbol already in DB")
        }

        dao.insert(
            SymbolEntity(
                country = companyProfile.country,
                currency = companyProfile.currency,
                exchange = companyProfile.exchange,
                name = companyProfile.name,
                ticker = ticker,
                ipo = companyProfile.ipo,
                marketCapitalization = companyProfile.marketCapitalization,
                shareOutstanding = companyProfile.shareOutstanding,
                logo = companyProfile.logo,
                phone = companyProfile.phone,
                weburl = companyProfile.weburl,
                finnhubIndustry = companyProfile.finnhubIndustry,
            )
        )
    }

    suspend fun deleteSymbol(symbol: String) {
        val symbolEntity = dao.findByTicker(symbol) ?: throw Exception("Not found")
        dao.delete(symbolEntity)
    }

}
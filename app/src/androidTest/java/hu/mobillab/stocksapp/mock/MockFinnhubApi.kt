package hu.mobillab.stocksapp.mock

import hu.mobillab.stocksapp.data.FinnhubApi
import hu.mobillab.stocksapp.model.*

class MockFinnhubApi : FinnhubApi {
    override suspend fun quoteGet(symbol: String): Quote {
        return Quote(
            c = 150f,
            h = 155f,
            l = 145f,
            pc = 148f,
            t = 1615298999.toBigDecimal()
        )
    }


    override suspend fun searchGet(q: String): Symbols {
        return Symbols(
            result = listOf(
                Symbol(
                    description = "APPLE INC",
                    displaySymbol = "AAPL",
                    symbol = "AAPL",
                    type = "Common Stock"
                ),
                Symbol(
                    description = "TESLA INC",
                    displaySymbol = "TSLA",
                    symbol = "TSLA",
                    type = "Common Stock"
                )
            ),
            count = 2.toBigDecimal()
        )
    }

    override suspend fun stockCandleGet(
        symbol: String,
        resolution: String,
        from: Int,
        to: Int
    ): ChartData {
        return ChartData(
            o = listOf(145f, 150f, 145f),
            h = listOf(149f, 152f, 147f),
            l = listOf(142f, 149f, 144f),
            c = listOf(145f, 150f, 145f),
            v = listOf(1000, 2000, 1000),
            t = listOf(1615298999, 1615398999, 1615498999),
            s = "ok",
        )
    }

    override suspend fun stockProfile2Delete(symbol: String) {
        TODO("Not yet implemented")
    }

    override suspend fun stockProfile2Get(symbol: String): CompanyProfile {
        return CompanyProfile(
            country= "US",
            currency= "USD",
            exchange= "NASDAQ/NMS (GLOBAL MARKET)",
            ipo= "1980-12-12",
            marketCapitalization= 1415993.toDouble(),
            name= "Apple Inc",
            phone= "14089961010",
            shareOutstanding= 4375.47998046875,
            ticker= "AAPL",
            weburl= "https=//www.apple.com/",
            logo= "https=//static.finnhub.io/logo/87cb30d8-80df-11ea-8951-00000000092a.png",
            finnhubIndustry="Technology"
        )
    }

    override suspend fun stockProfile2Post(symbol: String, body: CompanyProfile) {
        TODO("Not yet implemented")
    }

    override suspend fun stockProfile2Put(symbol: String, body: CompanyProfile) {
        TODO("Not yet implemented")
    }
}
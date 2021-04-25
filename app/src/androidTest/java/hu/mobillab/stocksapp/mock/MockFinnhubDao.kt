package hu.mobillab.stocksapp.mock

import hu.mobillab.stocksapp.data.FinnhubDao
import hu.mobillab.stocksapp.data.entity.SymbolEntity

class MockFinnhubDao : FinnhubDao {

    private val symbols = ArrayList<SymbolEntity>()

    override suspend fun getAllSymbols(): List<SymbolEntity> {
        return symbols
    }

    override suspend fun findByTicker(ticker: String): SymbolEntity? {
        return symbols.find {
            it.ticker == ticker
        }
    }

    override suspend fun insert(symbolEntity: SymbolEntity) {
        symbols.add(symbolEntity)
    }

    override suspend fun insertAll(vararg symbolEntity: SymbolEntity) {
        symbols.addAll(symbolEntity)
    }

    override suspend fun insertAll(symbolEntityList: List<SymbolEntity>) {
        symbols.addAll(symbolEntityList)
    }

    override suspend fun delete(symbolEntity: SymbolEntity?) {
        symbols.remove(symbolEntity)
    }

    override suspend fun updateSymbol(symbolEntity: SymbolEntity) {
        symbols.add(symbolEntity)
    }
}
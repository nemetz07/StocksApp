package hu.mobillab.stocksapp.data

import javax.inject.Inject

class StocksRepository @Inject constructor(private val webservice: FinnhubApi) {

    suspend fun refreshStocks() {
        throw NotImplementedError()
    }

    fun getStocks() {
        throw NotImplementedError()
    }

    suspend fun getStockDetails(symbol: String) {
        throw NotImplementedError()
    }

    fun storeStock() {
        throw NotImplementedError()
    }

    fun createStock() {
        throw NotImplementedError()
    }

    fun updateStock() {
        throw NotImplementedError()
    }

    fun deleteStock() {
        throw NotImplementedError()
    }
}
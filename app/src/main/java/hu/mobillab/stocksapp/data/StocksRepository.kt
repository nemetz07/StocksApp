package hu.mobillab.stocksapp.data

import hu.mobillab.stocksapp.model.Stock
import hu.mobillab.stocksapp.model.StockDetails
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class StocksRepository @Inject constructor() {

    fun refreshStocks() {
        throw NotImplementedError()
    }

    fun getStocks(): List<Stock> {
        throw NotImplementedError()
    }

    fun getStockDetails(stockId: String): StockDetails {
        throw NotImplementedError()
    }

    fun storeStock(stock: Stock) {
        throw NotImplementedError()
    }

    fun createStock(stock: Stock) {
        throw NotImplementedError()
    }

    fun updateStock(stock: Stock) {
        throw NotImplementedError()
    }

    fun deleteStock(stockId: String) {
        throw NotImplementedError()
    }
}
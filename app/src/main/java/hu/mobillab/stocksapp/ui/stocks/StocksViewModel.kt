package hu.mobillab.stocksapp.ui.stocks

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import hu.mobillab.stocksapp.data.StocksRepository
import javax.inject.Inject

@HiltViewModel
class StocksViewModel @Inject constructor(
    stocksRepository: StocksRepository
) : ViewModel() {

    fun refreshStocks() {
        throw NotImplementedError()
    }

    fun getStockList() {
        throw NotImplementedError()
    }

    fun addStock() {
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
package hu.mobillab.stocksapp.ui.stocks

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import hu.mobillab.stocksapp.data.FinnhubRepository
import kotlinx.coroutines.launch
import java.util.*
import javax.inject.Inject

@HiltViewModel
class StocksViewModel @Inject constructor(
    private val finnhubRepository: FinnhubRepository
) : ViewModel() {

    fun addSymbol(symbol: String) {
        viewModelScope.launch {
            try {
                finnhubRepository.addSymbol(symbol)
                println("Added")
            } catch (e: Exception) {
                println(e.message)
            }
        }
    }

    fun fetchChartData(symbol: String, from: Long, to: Long) {
        viewModelScope.launch {
            try {
                val chartData = finnhubRepository.fetchChartData(symbol, from, to)
                println(chartData)
            } catch (e: Exception) {
                println(e.message)
            }
        }
    }

    fun listSymbols() {
        viewModelScope.launch {
            val symbols = finnhubRepository.getSymbols()
            println(symbols)
        }
    }

    fun deleteSymbol(symbol: String) {
        viewModelScope.launch {
            try {
                finnhubRepository.deleteSymbol(symbol)
                println("Deleted")
            } catch (e: Exception) {
                println(e.message)
            }
        }
    }

    fun fetchAll() {
        viewModelScope.launch {
            finnhubRepository.fetchAll()
            println("Fetched")
        }
    }
}
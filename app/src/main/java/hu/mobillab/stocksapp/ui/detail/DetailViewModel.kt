package hu.mobillab.stocksapp.ui.detail

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import hu.mobillab.stocksapp.data.FinnhubRepository
import javax.inject.Inject

@HiltViewModel
class DetailViewModel @Inject constructor(
    private val finnhubRepository: FinnhubRepository
) : ViewModel() {

    fun getStockDetails() {
        throw NotImplementedError()
    }

}
package hu.mobillab.stocksapp.ui.stocks

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class StocksViewModel @Inject constructor() : ViewModel() {
    // TODO: Implement the ViewModel

    fun print(){
        println("KAKII")
    }
}
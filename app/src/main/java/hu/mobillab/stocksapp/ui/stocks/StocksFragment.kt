package hu.mobillab.stocksapp.ui.stocks

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import dagger.hilt.android.AndroidEntryPoint
import hu.mobillab.stocksapp.R

@AndroidEntryPoint
class StocksFragment : Fragment() {

    companion object {
        fun newInstance() = StocksFragment()
    }

    private val viewModel: StocksViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.stocks_fragment, container, false)

        //Dummy button to show that navigation to DetailFragment works
        rootView.findViewById<Button>(R.id.dummy_details_button).setOnClickListener {
            findNavController().navigate(R.id.detailFragment)
        }

        return rootView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}
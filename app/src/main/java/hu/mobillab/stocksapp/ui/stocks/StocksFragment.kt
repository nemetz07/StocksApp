package hu.mobillab.stocksapp.ui.stocks

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import hu.mobillab.stocksapp.R

class StocksFragment : Fragment() {

    companion object {
        fun newInstance() = StocksFragment()
    }

    private lateinit var viewModel: StocksViewModel

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

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(StocksViewModel::class.java)
        // TODO: Use the ViewModel

    }

}
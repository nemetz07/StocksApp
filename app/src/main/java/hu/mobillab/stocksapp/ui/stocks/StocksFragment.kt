package hu.mobillab.stocksapp.ui.stocks

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import dagger.hilt.android.AndroidEntryPoint
import hu.mobillab.stocksapp.R
import org.threeten.bp.DayOfWeek
import org.threeten.bp.ZoneId
import org.threeten.bp.ZonedDateTime

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
//        rootView.findViewById<Button>(R.id.dummy_details_button).setOnClickListener {
//            viewModel.refreshStocks()
//        }

        return rootView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.list_symbols_button).setOnClickListener {
            viewModel.listSymbols()
        }

        view.findViewById<Button>(R.id.add_aapl_button).setOnClickListener {
            viewModel.addSymbol("AAPL")
        }

        view.findViewById<Button>(R.id.delete_aapl_button).setOnClickListener {
            viewModel.deleteSymbol("AAPL")
        }

        view.findViewById<Button>(R.id.add_tsla_button).setOnClickListener {
            viewModel.addSymbol("TSLA")
        }

        view.findViewById<Button>(R.id.delete_tsla_button).setOnClickListener {
            viewModel.deleteSymbol("TSLA")
        }

        view.findViewById<Button>(R.id.fetch_tsla_chart_button).setOnClickListener {
            val z: ZoneId = ZoneId.of("Europe/Budapest")
            val now = ZonedDateTime.now(z)
            val startOfDay =
                if (now.dayOfWeek == DayOfWeek.SUNDAY) {
                    now.toLocalDate().atStartOfDay(z).minusDays(3)
                } else if (now.dayOfWeek != DayOfWeek.SATURDAY) {
                    now.toLocalDate().atStartOfDay(z).minusDays(2)
                } else {
                    now.toLocalDate().atStartOfDay(z).minusDays(1)
                }
            viewModel.fetchChartData("TSLA", startOfDay.toEpochSecond(), now.toEpochSecond())
        }

        view.findViewById<Button>(R.id.fetch_all_button).setOnClickListener {
            viewModel.fetchAll()
        }

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}
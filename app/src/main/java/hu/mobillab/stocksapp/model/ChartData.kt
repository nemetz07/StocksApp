/**
 * NOTE: This class is auto generated by the Swagger Gradle Codegen for the following API: Finnhub API
 *
 * More info on this tool is available on https://github.com/Yelp/swagger-gradle-codegen
 */

package hu.mobillab.stocksapp.model

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Get candlestick data (OHLCV) for stocks
 * @property o List of open prices for returned candles
 * @property h List of high prices for returned candles
 * @property l List of low prices for returned candles
 * @property c List of close prices for returned candles
 * @property v List of volume data for returned candles
 * @property t List of timestamp for returned candles
 * @property s Status of the response. This field can either be ok or no_data
 */
@JsonClass(generateAdapter = true)
data class ChartData(
    @Json(name = "o") @field:Json(name = "o") var o: List<Float>? = null,
    @Json(name = "h") @field:Json(name = "h") var h: List<Float>? = null,
    @Json(name = "l") @field:Json(name = "l") var l: List<Float>? = null,
    @Json(name = "c") @field:Json(name = "c") var c: List<Float>? = null,
    @Json(name = "v") @field:Json(name = "v") var v: List<Int>? = null,
    @Json(name = "t") @field:Json(name = "t") var t: List<Int>? = null,
    @Json(name = "s") @field:Json(name = "s") var s: String? = null
)
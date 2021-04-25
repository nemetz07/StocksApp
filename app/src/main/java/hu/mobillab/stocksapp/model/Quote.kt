/**
 * NOTE: This class is auto generated by the Swagger Gradle Codegen for the following API: Finnhub API
 *
 * More info on this tool is available on https://github.com/Yelp/swagger-gradle-codegen
 */

package hu.mobillab.stocksapp.model

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import java.math.BigDecimal

/**
 * Get real-time quote data for US stocks
 * @property o Open price of the day
 * @property h High price of the day
 * @property l Low price of the day
 * @property c Current price
 * @property pc Previous close price
 * @property t Timestamp
 */
@JsonClass(generateAdapter = true)
data class Quote(
    @Json(name = "o") @field:Json(name = "o") var o: Float? = null,
    @Json(name = "h") @field:Json(name = "h") var h: Float? = null,
    @Json(name = "l") @field:Json(name = "l") var l: Float? = null,
    @Json(name = "c") @field:Json(name = "c") var c: Float? = null,
    @Json(name = "pc") @field:Json(name = "pc") var pc: Float? = null,
    @Json(name = "t") @field:Json(name = "t") var t: BigDecimal? = null
)
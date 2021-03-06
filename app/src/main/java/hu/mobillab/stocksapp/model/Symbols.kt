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
 * Search for best-matching symbols based on your query. You can input anything from symbol, security's name to ISIN and Cusip.
 * @property result Array of search results
 * @property count Number of results
 */
@JsonClass(generateAdapter = true)
data class Symbols(
    @Json(name = "result") @field:Json(name = "result") var result: List<Symbol>? = null,
    @Json(name = "count") @field:Json(name = "count") var count: BigDecimal? = null
)

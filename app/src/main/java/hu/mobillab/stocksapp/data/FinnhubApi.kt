/**
 * NOTE: This class is auto generated by the Swagger Gradle Codegen for the following API: Finnhub API
 *
 * More info on this tool is available on https://github.com/Yelp/swagger-gradle-codegen
 */

package hu.mobillab.stocksapp.data

import hu.mobillab.stocksapp.model.ChartData
import hu.mobillab.stocksapp.model.CompanyProfile
import hu.mobillab.stocksapp.model.Quote
import hu.mobillab.stocksapp.model.Symbols
import hu.mobillab.stocksapp.model.UnauthorizedError
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT

@JvmSuppressWildcards
interface FinnhubApi {
    /**
     * Get real-time quote data for US stocks
     * The endpoint is owned by StocksApp service owner
     * @param symbol Stock symbol (required)
     */
    @GET("quote")
    suspend fun quoteGet(
        @retrofit2.http.Query("symbol") symbol: String
    ): Quote
    /**
     * Search for best-matching symbols based on your query
     * The endpoint is owned by StocksApp service owner
     * @param q Query text can be symbol, name, isin, or cusip (required)
     */
    @GET("search")
    suspend fun searchGet(
        @retrofit2.http.Query("q") q: String
    ): Symbols
    /**
     * Get candlestick data (OHLCV) for stocks
     * The endpoint is owned by StocksApp service owner
     * @param symbol (required)
     * @param resolution Supported resolution includes 1, 5, 15, 30, 60, D, W, M (required)
     * @param from (required)
     * @param to (required)
     */
    @GET("stock/candle")
    suspend fun stockCandleGet(
        @retrofit2.http.Query("symbol") symbol: String,
        @retrofit2.http.Query("resolution") resolution: String,
        @retrofit2.http.Query("from") from: Int,
        @retrofit2.http.Query("to") to: Int
    ): ChartData
    /**
     * Remove general information of a company (DUMMY)
     * The endpoint is owned by StocksApp service owner
     * @param symbol Stock symbol (required)
     */
    @DELETE("stock/profile2")
    suspend fun stockProfile2Delete(
        @retrofit2.http.Query("symbol") symbol: String
    ): Unit
    /**
     * Get general information of a company
     * The endpoint is owned by StocksApp service owner
     * @param symbol Stock symbol (required)
     */
    @GET("stock/profile2")
    suspend fun stockProfile2Get(
        @retrofit2.http.Query("symbol") symbol: String
    ): CompanyProfile
    /**
     * Add new general information of a company (DUMMY)
     * The endpoint is owned by StocksApp service owner
     * @param symbol Stock symbol (required)
     * @param body (required)
     */
    @POST("stock/profile2")
    suspend fun stockProfile2Post(
        @retrofit2.http.Query("symbol") symbol: String,
        @retrofit2.http.Body body: CompanyProfile
    ): Unit
    /**
     * Modify general information of a company (DUMMY)
     * The endpoint is owned by StocksApp service owner
     * @param symbol Stock symbol (required)
     * @param body (required)
     */
    @PUT("stock/profile2")
    suspend fun stockProfile2Put(
        @retrofit2.http.Query("symbol") symbol: String,
        @retrofit2.http.Body body: CompanyProfile
    ): Unit
}

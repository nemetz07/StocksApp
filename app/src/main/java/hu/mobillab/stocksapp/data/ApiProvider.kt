package hu.mobillab.stocksapp.data

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import hu.mobillab.stocksapp.util.GeneratedCodeConverters
import hu.mobillab.stocksapp.util.FINNHUB_TOKEN
import okhttp3.OkHttpClient
import retrofit2.Retrofit

@Module
@InstallIn(SingletonComponent::class)
object ApiProvider {

    @Provides
    fun provideFinnhubApi(): FinnhubApi {
        return Retrofit.Builder()
            .baseUrl("https://finnhub.io/api/v1/")
            .client(
                OkHttpClient.Builder().also {
                    it.addInterceptor { chain ->
                        val request =
                            chain.request()
                                .newBuilder()
                                .addHeader("X-Finnhub-Token", FINNHUB_TOKEN)
                                .build()
                        chain.proceed(request)
                    }
                }.build()
            )
            .addConverterFactory(GeneratedCodeConverters.converterFactory())
            .build()
            .create(FinnhubApi::class.java)
    }

}
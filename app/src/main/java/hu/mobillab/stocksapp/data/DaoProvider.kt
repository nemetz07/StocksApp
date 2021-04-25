package hu.mobillab.stocksapp.data

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DaoProvider {

    @Provides
    fun provideFinnhubDao(db: FinnhubDatabase): FinnhubDao {
        return db.finnhubDao()
    }

}
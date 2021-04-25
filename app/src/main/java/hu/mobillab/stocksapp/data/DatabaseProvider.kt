package hu.mobillab.stocksapp.data

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseProvider {

    @Provides
    @Singleton
    fun provideFinnhubDatabase(@ApplicationContext context: Context): FinnhubDatabase {
        return Room.databaseBuilder(
            context,
            FinnhubDatabase::class.java,
            "stocks"
        ).build()
    }

}
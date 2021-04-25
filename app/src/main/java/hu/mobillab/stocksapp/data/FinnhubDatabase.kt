package hu.mobillab.stocksapp.data

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import hu.mobillab.stocksapp.data.entity.SymbolEntity
import hu.mobillab.stocksapp.util.Converters

@Database(entities = arrayOf(SymbolEntity::class), version = 1)
@TypeConverters(Converters::class)
abstract class FinnhubDatabase: RoomDatabase() {
    abstract fun finnhubDao(): FinnhubDao
}
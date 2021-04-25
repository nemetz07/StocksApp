package hu.mobillab.stocksapp.data

import androidx.room.*
import hu.mobillab.stocksapp.data.entity.SymbolEntity

@Dao
interface FinnhubDao {

    @Query("SELECT * FROM symbolentity")
    suspend fun getAllSymbols(): List<SymbolEntity>

    @Query("SELECT id, ticker FROM symbolentity WHERE ticker = (:ticker)")
    suspend fun findByTicker(ticker: String): SymbolEntity?

    @Insert
    suspend fun insert(symbolEntity: SymbolEntity)

    @Insert
    suspend fun insertAll(vararg symbolEntity: SymbolEntity)

    @Insert
    suspend fun insertAll(symbolEntityList: List<SymbolEntity>)

    @Delete
    suspend fun delete(symbolEntity: SymbolEntity?)

    @Update
    suspend fun updateSymbol(symbolEntity: SymbolEntity)
}
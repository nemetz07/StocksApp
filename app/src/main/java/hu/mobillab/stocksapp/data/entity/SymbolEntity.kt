package hu.mobillab.stocksapp.data.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey
import org.threeten.bp.ZonedDateTime

@Entity(indices = arrayOf(Index(value = ["ticker"], unique = true)))
data class SymbolEntity(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    @ColumnInfo(name = "country") val country: String? = null,
    @ColumnInfo(name = "currency") val currency: String? = null,
    @ColumnInfo(name = "exchange") val exchange: String? = null,
    @ColumnInfo(name = "name") val name: String? = null,
    @ColumnInfo(name = "ticker") val ticker: String,
    @ColumnInfo(name = "ipo") val ipo: String? = null,
    @ColumnInfo(name = "market_capitalization") val marketCapitalization: Double? = null,
    @ColumnInfo(name = "share_outstanding") val shareOutstanding: Double? = null,
    @ColumnInfo(name = "logo") val logo: String? = null,
    @ColumnInfo(name = "phone") val phone: String? = null,
    @ColumnInfo(name = "weburl") val weburl: String? = null,
    @ColumnInfo(name = "finnhub_industry") val finnhubIndustry: String? = null,
    @ColumnInfo(name = "open") var open: Float? = null,
    @ColumnInfo(name = "high") var high: Float? = null,
    @ColumnInfo(name = "low") var low: Float? = null,
    @ColumnInfo(name = "current") var current: Float? = null,
    @ColumnInfo(name = "close") var close: Float? = null,
    @ColumnInfo(name = "created_at") val createdAt: ZonedDateTime? = ZonedDateTime.now(),
    @ColumnInfo(name = "updated_at") var updatedAt: ZonedDateTime? = ZonedDateTime.now()
)
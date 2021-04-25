package hu.mobillab.stocksapp.util

import androidx.room.TypeConverter
import org.threeten.bp.Instant
import org.threeten.bp.ZoneId
import org.threeten.bp.ZonedDateTime
import java.math.BigDecimal

class Converters {
    private val z: ZoneId = ZoneId.of("Europe/Budapest")

    @TypeConverter
    fun fromTimestamp(value: BigDecimal?): ZonedDateTime? {
        return value?.let {
            ZonedDateTime.ofInstant(Instant.ofEpochSecond(it.toLong()), z)
        }
    }

    @TypeConverter
    fun fromTimestampInt(value: Int?): ZonedDateTime? {
        return value?.let {
            ZonedDateTime.ofInstant(Instant.ofEpochSecond(it.toLong()), z)
        }
    }

    @TypeConverter
    fun dateToTimestamp(date: ZonedDateTime?): BigDecimal? {
        return date?.toEpochSecond()?.toBigDecimal()
    }

    @TypeConverter
    fun dateToTimestampInt(date: ZonedDateTime?): Int? {
        return date?.toEpochSecond()?.toInt()
    }
}
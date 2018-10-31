package quiambao.jonathan.timerapp.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "timers")
data class Timer(
    @PrimaryKey(autoGenerate = true) @ColumnInfo(name = "id") val timerId: Long,
    @ColumnInfo(name = "title") val title: String,
    @ColumnInfo(name = "length") val length: Long,
    @ColumnInfo(name = "auto_start") val autoStart: Boolean = true
)
package quiambao.jonathan.timerapp.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Query

@Dao
interface TimerDao : BaseDao<Timer> {

    @Query("SELECT * FROM timers ORDER BY title")
    fun getTimers(): LiveData<List<Timer>>

    @Query("SELECT * FROM timers WHERE id IN (:ids)")
    fun getTimers(ids: List<Long>): LiveData<List<Timer>>

    @Query("SELECT * FROM timers WHERE id = :timerId")
    fun getTimer(timerId: Long): LiveData<Timer>

}
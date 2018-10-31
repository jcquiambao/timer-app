package quiambao.jonathan.timerapp.data

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Update

interface BaseDao<T> {

    @Insert
    fun insert(obj: T)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(objects: List<T>)

    @Update
    fun update(objects: List<T>)

    @Delete
    fun delete(objects: List<Timer>)

}
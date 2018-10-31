package quiambao.jonathan.timerapp.data

class TimerRepository private constructor(private val timerDao: TimerDao) {

    fun getTimers() = timerDao.getTimers()

    fun getTimer(timerId: Long) = timerDao.getTimer(timerId)

    companion object {
        @Volatile private var instance: TimerRepository? = null

        fun getInstance(timerDao: TimerDao) =
                instance ?: synchronized(this) {
                    instance ?: TimerRepository(timerDao).also { instance = it }
                }
    }
}
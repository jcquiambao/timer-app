package quiambao.jonathan.timerapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import quiambao.jonathan.timerapp.ui.timer.TimerFragment

class TimerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.timer_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, TimerFragment.newInstance())
                .commitNow()
        }
    }

}

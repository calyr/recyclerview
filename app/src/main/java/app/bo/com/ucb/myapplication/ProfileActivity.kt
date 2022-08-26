package app.bo.com.ucb.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val appName = intent.extras?.getString("appname")
        Toast.makeText(this, appName, Toast.LENGTH_LONG).show()
    }
}
package app.bo.com.ucb.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var btnLogin: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnLogin = findViewById(R.id.btn_login)
        val btnContextText = getString(R.string.btn_login)
        val titleApp = getString(R.string.app_name)
        val titleApp2 = R.string.app_name.toString() //Mal si queremos obtener el valor del Texto del archivo de String

        val btnOpenProfile: Button = findViewById(R.id.btn_open_profile)
        Toast.makeText(this, titleApp, Toast.LENGTH_LONG ).show()
        Toast.makeText(applicationContext, titleApp, Toast.LENGTH_LONG ).show()

        btnOpenProfile.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            intent.putExtra("appname", titleApp)
            startActivity(intent)
        }
    }
}
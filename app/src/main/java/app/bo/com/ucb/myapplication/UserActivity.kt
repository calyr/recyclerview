package app.bo.com.ucb.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class UserActivity : AppCompatActivity() {

    lateinit var rvUsers : RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user)
        //ejemplo
        val nameApp = getString(R.string.app_name)
        //
        rvUsers = findViewById(R.id.rv_users)
        val list = arrayListOf<User>(
            User("Roberto Carlos", "calyr.software@gmail.com"),
            User("Carlos1", "rcallisaya@ucb.edu.bo"),
            User("Roberto Carlos3", "calyr.software@gmail.com"),
            User("Carlos", "rcallisaya@ucb.edu.bo"),
            User("Roberto Carlos", "calyr.software@gmail.com"),
            User("Carlos", "rcallisaya@ucb.edu.bo"),
            User("Roberto Carlos", "calyr.software@gmail.com"),
            User("Carlos", "rcallisaya@ucb.edu.bo"),
            User("Roberto Carlos", "calyr.software@gmail.com"),
            User("Carlos", "rcallisaya@ucb.edu.bo"),
            User("Roberto Carlos", "calyr.software@gmail.com"),
            User("Carlos1", "rcallisaya@ucb.edu.bo"),
            User("Roberto Carlos3", "calyr.software@gmail.com"),
            User("Carlos", "rcallisaya@ucb.edu.bo"),
            User("Roberto Carlos", "calyr.software@gmail.com"),
            User("Carlos", "rcallisaya@ucb.edu.bo"),
            User("Roberto Carlos", "calyr.software@gmail.com"),
            User("Carlos", "rcallisaya@ucb.edu.bo"),
            User("Roberto Carlos", "calyr.software@gmail.com"),
            User("Carlos", "rcallisaya@ucb.edu.bo")
        )

        val linearLayout = LinearLayoutManager(this)
        linearLayout.orientation = LinearLayoutManager.VERTICAL

        rvUsers.layoutManager = linearLayout
        rvUsers.adapter = UserAdapter(list, applicationContext)
    }
}
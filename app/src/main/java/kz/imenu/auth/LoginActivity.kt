package kz.imenu.auth

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_login.*
import kz.imenu.R
import kz.imenu.order.OrderListActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        loginBtn.setOnClickListener {
            startActivity(Intent(this, OrderListActivity::class.java))
        }
        registerBtn.setOnClickListener {
            startActivity(Intent(this, RegistrationActivity::class.java))
        }
    }
}
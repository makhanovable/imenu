package kz.imenu.auth

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_registration.*
import kz.imenu.R
import kz.imenu.order.OrderListActivity

class RegistrationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)


        registerBtn.setOnClickListener {
            startActivity(Intent(this, OrderListActivity::class.java))
        }
    }
}
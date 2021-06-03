package kz.imenu.main

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.zxing.integration.android.IntentIntegrator
import kotlinx.android.synthetic.main.activity_main.*
import kz.imenu.R
import kz.imenu.auth.LoginActivity
import kz.imenu.order.CreateOrderActivity


@Suppress("DEPRECATION")
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        adminBtn.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }
        clientBtn.setOnClickListener {
//            startActivity(Intent(this, CreateOrderActivity::class.java))
            openScanner()
        }
    }

    private fun openScanner() {
        IntentIntegrator(this).initiateScan()
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        val result = IntentIntegrator.parseActivityResult(requestCode, resultCode, data)
        if (result != null) {
            if (result.getContents() == null) {
                Toast.makeText(this, "Ошибка", Toast.LENGTH_LONG).show()
//                startActivity(Intent(this, CreateOrderActivity::class.java))
            } else {
                startActivity(Intent(this, CreateOrderActivity::class.java))
            }
        } else {
            super.onActivityResult(requestCode, resultCode, data);
        }
    }
}
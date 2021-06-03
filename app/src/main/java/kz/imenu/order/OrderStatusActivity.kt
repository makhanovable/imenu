package kz.imenu.order

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View.VISIBLE
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_order_status.*
import kz.imenu.R

class OrderStatusActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order_status)

        Handler(Looper.getMainLooper()).postDelayed({
            made()
        }, 3000)
    }

    private fun made() {
        pay.visibility = VISIBLE
        texxx.text = "Не забудьте оплатить заказ"
        zz.text = "Заказ #0005 готов"
        p.progress = 100
    }
}
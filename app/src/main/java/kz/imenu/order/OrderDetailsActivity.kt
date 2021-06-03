package kz.imenu.order

import android.content.Intent
import android.os.Bundle
import android.view.View.GONE
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_order_details.*
import kz.imenu.R

class OrderDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order_details)


        val toHide = intent?.extras?.getBoolean("hide") ?: false
        if (toHide) bottom.visibility = GONE
        bottom.setOnClickListener {
            startActivity(Intent(this, OrderStatusActivity::class.java))
        }

        val list = arrayListOf<CreateOrder>()
        list.add(
            CreateOrder(
                "https://assets.change.org/photos/9/ms/oi/XemSoIQisAlZnyj-800x450-noPad.jpg?1485754965",
                "Snack Box",
                "1490 тг",
                1
            )
        )
        list.add(
            CreateOrder(
                "https://mcdonalds.kz/storage/928/O42fQvyiFw.png",
                "McCombo 'Биг Тейсти' (стандартная порция)",
                "1850 тг",
                1
            )
        )
        list.add(
            CreateOrder(
                "https://mcdonalds.kz/storage/930/gs4SQ80bnD.png",
                "McCombo 'Чикен Тейсти' (стандартная порция)",
                "1700 тг",
                1
            )
        )

        listRv.adapter = OrderDetailsAdapter(list)
    }
}
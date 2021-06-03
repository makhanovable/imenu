package kz.imenu.order

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_order_list.*
import kz.imenu.R
import kz.imenu.qr.CreateQRActivity

class OrderListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order_list)


        qr.setOnClickListener {
            startActivity(Intent(this, CreateQRActivity::class.java))
        }
        val list = arrayListOf<CreateOrder>()
        list.add(
            CreateOrder(
                "https://cdn0.iconfinder.com/data/icons/kameleon-free-pack-rounded/110/Food-Dome-512.png",
                "Заказ 12323",
                "Столик 12"
            )
        )
        list.add(
            CreateOrder(
                "https://cdn0.iconfinder.com/data/icons/kameleon-free-pack-rounded/110/Food-Dome-512.png",
                "Заказ 123",
                "Столик 9"
            )
        )

        listRv.adapter = OrderListAdapter(list, {
            val intent = Intent(this, OrderDetailsActivity::class.java)
            intent.putExtra("hide", true)
            startActivity(intent)
        }, {
            Toast.makeText(this, "Заказ принят", Toast.LENGTH_SHORT).show()
        })
    }
}
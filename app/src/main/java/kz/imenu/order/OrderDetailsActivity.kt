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
                "https://chefrestoran.ru/wp-content/uploads/2018/08/chef_BD_035.jpg",
                "Донер",
                "900 тг"
            )
        )
        list.add(
            CreateOrder(
                "https://chefrestoran.ru/wp-content/uploads/2018/08/chef_BD_035.jpg",
                "Донер",
                "900 тг"
            )
        )
        list.add(
            CreateOrder(
                "https://chefrestoran.ru/wp-content/uploads/2018/08/chef_BD_035.jpg",
                "Донер",
                "900 тг"
            )
        )
        list.add(
            CreateOrder(
                "https://chefrestoran.ru/wp-content/uploads/2018/08/chef_BD_035.jpg",
                "Донер",
                "900 тг"
            )
        )
        list.add(
            CreateOrder(
                "https://chefrestoran.ru/wp-content/uploads/2018/08/chef_BD_035.jpg",
                "Донер",
                "900 тг"
            )
        )
        list.add(
            CreateOrder(
                "https://chefrestoran.ru/wp-content/uploads/2018/08/chef_BD_035.jpg",
                "Донер",
                "900 тг"
            )
        )
        list.add(
            CreateOrder(
                "https://chefrestoran.ru/wp-content/uploads/2018/08/chef_BD_035.jpg",
                "Донер",
                "900 тг"
            )
        )
        list.add(
            CreateOrder(
                "https://chefrestoran.ru/wp-content/uploads/2018/08/chef_BD_035.jpg",
                "Донер",
                "900 тг"
            )
        )
        list.add(
            CreateOrder(
                "https://chefrestoran.ru/wp-content/uploads/2018/08/chef_BD_035.jpg",
                "Донер",
                "900 тг"
            )
        )
        list.add(
            CreateOrder(
                "https://chefrestoran.ru/wp-content/uploads/2018/08/chef_BD_035.jpg",
                "Донер",
                "900 тг"
            )
        )

        listRv.adapter = OrderDetailsAdapter(list)
    }
}
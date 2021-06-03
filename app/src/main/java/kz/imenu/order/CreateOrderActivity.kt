package kz.imenu.order

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_create_order.*
import kz.imenu.R

class CreateOrderActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_order)

        bottom.setOnClickListener {
            startActivity(Intent(this, OrderDetailsActivity::class.java))
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

        listRv.adapter = CreateOrderAdapter(list)

    }
}
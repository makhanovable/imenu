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
                "https://lh3.googleusercontent.com/proxy/z7tlh_Bpe70GzBlE4779VYuSjhOSFXFpd63dYe1eQVL1Kr-irlmM1ZwVhj6YBjbXFB_x04tSJpOI77aOOVD-pTkHOfl2_DMS2Lvous8r5dr3rDqJSboyPniglnfP9zGQ",
                "Куриные крылья (7шт)",
                "1490 тг"
            )
        )
        list.add(
            CreateOrder(
                "https://just-eat.by/image/data/shops/46303/93759.jpg",
                "Стрипсы (3шт)",
                "650 тг"
            )
        )
        list.add(
            CreateOrder(
                "https://assets.change.org/photos/9/ms/oi/XemSoIQisAlZnyj-800x450-noPad.jpg?1485754965",
                "Snack Box",
                "1490 тг"
            )
        )
        list.add(
            CreateOrder(
                "https://mcdonalds.kz/storage/928/O42fQvyiFw.png",
                "McCombo 'Биг Тейсти' (стандартная порция)",
                "1850 тг"
            )
        )
        list.add(
            CreateOrder(
                "https://mcdonalds.kz/storage/930/gs4SQ80bnD.png",
                "McCombo 'Чикен Тейсти' (стандартная порция)",
                "1700 тг"
            )
        )
        list.add(
            CreateOrder(
                "https://mcdonalds.kz/storage/932/v3r8FMvp0e.png",
                "McCombo 'Роял Чизбургер' (большая порция)",
                "1450 тг"
            )
        )
        list.add(
            CreateOrder(
                "https://eda.yandex/images/1380298/7388ebaea4b84c7d67a382d30a84bc27-450x300.jpg",
                "McCombo 'Двойной Чизбургер' (стандартная порция)",
                "1250 тг"
            )
        )
        list.add(
            CreateOrder(
                "https://eda.yandex/images/1370147/ebdfabec814eecfbdc7acacbc3896086-450x300.jpg",
                "McCombo 'Двойной Чизбургер' (большая порция)",
                "1350 тг"
            )
        )
        list.add(
            CreateOrder(
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTHYcoa0P51q8EHZAHon5Nso0S2FhdgK1tuC7l0KarZnOOMSGjWAwtqgu3CrNyQE6Dv7y8&usqp=CAU",
                "McCombo 'Биг Мак' (стандартная порция)",
                "1350 тг"
            )
        )
        list.add(
            CreateOrder(
                "https://res.cloudinary.com/glovoapp/w_351,h_179,f_auto,q_auto/Stores/k5erm5zkrrltjnhnfphs",
                "McCombo 'Биг Мак' (большая порция)",
                "1450 тг"
            )
        )

        listRv.adapter = CreateOrderAdapter(list)

    }
}
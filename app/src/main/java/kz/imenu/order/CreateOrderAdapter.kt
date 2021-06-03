package kz.imenu.order

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_create_order.view.*
import kz.imenu.R

class CreateOrderAdapter(
    val items: List<CreateOrder>
) : RecyclerView.Adapter<CreateOrderViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CreateOrderViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_create_order, parent, false)
        return CreateOrderViewHolder(view)
    }

    override fun onBindViewHolder(holder: CreateOrderViewHolder, position: Int) {
        holder.itemView.title.text = items[position].title
        holder.itemView.price.text = items[position].price
        holder.itemView.count.text = items[position].count.toString()
        holder.itemView.add.setOnClickListener {
            holder.itemView.count.text = "1"
        }

        Picasso.get().load(items[position].image).into(holder.itemView.imageView)
    }

    override fun getItemCount() = items.size
}

class CreateOrderViewHolder(view: View) : RecyclerView.ViewHolder(view)

data class CreateOrder(
    val image: String,
    val title: String,
    val price: String,
    var count: Int = 0
)
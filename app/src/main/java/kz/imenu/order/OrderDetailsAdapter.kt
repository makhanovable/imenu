package kz.imenu.order

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_order_details.view.*
import kz.imenu.R

class OrderDetailsAdapter(
    val items: List<CreateOrder>
) : RecyclerView.Adapter<OrderDetailsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OrderDetailsViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_order_details, parent, false)
        return OrderDetailsViewHolder(view)
    }

    override fun onBindViewHolder(holder: OrderDetailsViewHolder, position: Int) {
        holder.itemView.title.text = items[position].title
        holder.itemView.count.text = "Количество: " + items[position].count.toString()

        Picasso.get().load(items[position].image).into(holder.itemView.imageView)
    }

    override fun getItemCount() = items.size
}

class OrderDetailsViewHolder(view: View) : RecyclerView.ViewHolder(view)
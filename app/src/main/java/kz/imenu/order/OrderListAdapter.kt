package kz.imenu.order

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_order_list.view.*
import kz.imenu.R

class OrderListAdapter(
    val items: List<CreateOrder>,
    val pressed: () -> Unit,
    val accept: () -> Unit
) : RecyclerView.Adapter<CreateOrderViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CreateOrderViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_order_list, parent, false)
        return CreateOrderViewHolder(view)
    }

    override fun onBindViewHolder(holder: CreateOrderViewHolder, position: Int) {
        holder.itemView.title.text = items[position].title
        holder.itemView.count.text = items[position].price.toString()
        holder.itemView.cont.setOnClickListener {
            pressed.invoke()
        }
        holder.itemView.accept.setOnClickListener {
            accept.invoke()
        }

        Picasso.get().load(items[position].image).into(holder.itemView.imageView)
    }

    override fun getItemCount() = items.size
}

class OrderListViewHolder(view: View) : RecyclerView.ViewHolder(view)
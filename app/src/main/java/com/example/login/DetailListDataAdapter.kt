package com.example.login

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.detail_list_data_item.view.*

class DetailListDataAdapter(
    private val list: ArrayList<DetailListDataResponse>
): RecyclerView.Adapter<DetailListDataAdapter.PostViewHolder>() {

    inner class PostViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        fun bind(postResponse: DetailListDataResponse) {
            with(itemView) {
                val text = "Detail: ${postResponse.detail}\n" +
                        "Pengirim: ${postResponse.pengirim}\n" +
                        "Penerima: ${postResponse.penerima}"

                tvText.text = text
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.detail_list_data_item, parent, false)
        return PostViewHolder(view)
    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int = list.size

}
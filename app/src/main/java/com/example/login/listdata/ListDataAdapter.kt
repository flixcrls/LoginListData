package com.example.login.listdata

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.login.DetailListData
import com.example.login.databinding.ListDataItemBinding

class ListDataAdapter(

    private val list: ArrayList<ListDataResponse>

) : RecyclerView.Adapter<ListDataAdapter.UserViewHolder>() {

    inner class UserViewHolder(val binding: ListDataItemBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(post: ListDataResponse) {
            with(itemView) {
                val text = "No Order: ${post.no_order}\n" +
                        "ID Order: ${post.id_order}\n" +
                        "Nama Pengirim: ${post.nama_pengirim}\n" +
                        "Kabupaten Asal: ${post.kab_asal}\n" +
                        "Kabupaten Tujuan: ${post.kab_tujuan}\n" +
                        "Status Pengiriman: ${post.status_pengiriman}"

                binding.tvResponse.text = text
                binding.btnDetail.setOnClickListener {
                    val intent = Intent(context, DetailListData::class.java)
                    startActivity(this.context, intent, null)
                }
            }
        }
    }



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val binding = ListDataItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return UserViewHolder(binding)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int = list.size

}
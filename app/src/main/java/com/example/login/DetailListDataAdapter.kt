package com.example.login

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.login.databinding.DetailListDataItemBinding

class DetailListDataAdapter(
    private val list: ArrayList<DetailListDataResponse>
): RecyclerView.Adapter<DetailListDataAdapter.PostViewHolder>() {

    inner class PostViewHolder(val binding: DetailListDataItemBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(postResponse: DetailListDataResponse) {
            with(itemView) {
                val text = "Nama: ${postResponse.detail.namaPerjanjian}\n" +
                        "Tipe Pengiriman: ${postResponse.detail.tipePengiriman}\n" +
                        "Nama Transporter: ${postResponse.detail.namaTransporter}\n" +
                        "Harga: ${postResponse.detail.harga}\n" +
                        "Gambar: ${postResponse.detail.image}"

                binding.tvText.text = text
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        val binding = DetailListDataItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return PostViewHolder(binding)
    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int = list.size

}
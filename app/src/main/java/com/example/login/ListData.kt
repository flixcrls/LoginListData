package com.example.login

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.list_data.*
import kotlinx.android.synthetic.main.list_data_item.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ListData : AppCompatActivity() {

    private var list = ArrayList<ListDataResponse>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.list_data)
        showListData()

//        btnDetail.setOnClickListener {
//            Intent(this, DetailListData::class.java).also {
//                startActivity(it)
//            }
//        }

    }

    private fun showListData() {
        rvListData.setHasFixedSize(true)
        rvListData.layoutManager = LinearLayoutManager(this)
        val listDataAdapter = ListDataAdapter(list)

        listDataAdapter.setOnItemCallback(object : ListDataAdapter.OnItemClickCallback {
            override fun onItemClicked(data: ListData) {
                btnDetail.setOnClickListener {
                    Intent(this@ListData, DetailListData::class.java).also {
                        startActivity(it)
                    }
                }
            }
        })

        RetrofitClient.instance.getPosts("eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpZCI6Ijc5NThiNTA3YjQyMTg1ZDg1MjlkMjJkYTUxNmE5ZTI0ZWQ1MGNiYWI5YTAzYzIyYmRkNTY3NTJhMzJiMDBjMTllMzg2NWQ3YzA2YjhkMTU1NjgzMTkwNjIyZDc3M2RjMDRmMWE4ZGVkNzRlZmFlYjliMjAyMjQzNjMzOTQwZDIyVHJmdVBETGRTS0x0aXJyYXgraktMNEVaMkE9PSIsInVzZXJuYW1lIjoiRW5kaSBTdW1hcm5vIiwidG9rZW4iOiJDTTJ6b0NxNWk4Z1VaRU5nIiwidGltZXN0YW1wIjoxNjU4MTk1Njc4fQ.WZ0KWJ4Zpq359yJw-ZlgJN1hkgFQjG7kIY6fiDdFj2w",
            1, 10, 1)
            .enqueue(object: Callback<ArrayList<ListDataResponse>>{
            override fun onResponse(
                call: Call<ArrayList<ListDataResponse>>,
                response: Response<ArrayList<ListDataResponse>>
            ) {
                val listResponse = response.body()
                listResponse?.let { list.addAll(it) }
                val adapter = ListDataAdapter(list)
                rvListData.adapter = adapter
            }

            override fun onFailure(call: Call<ArrayList<ListDataResponse>>, t: Throwable) {
                t.message?.let { Log.e("error", it) }
            }
        })
    }
}
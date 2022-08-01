package com.example.login.listdata

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.login.RetrofitClient
import com.example.login.databinding.ListDataBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ListData : AppCompatActivity() {

    private lateinit var binding: ListDataBinding

    private var list = ArrayList<ListDataResponse>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ListDataBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        showListData()

//        btnDetail.setOnClickListener {
//            Intent(this, DetailListData::class.java).also {
//                startActivity(it)
//            }
//        }

    }

    private fun showListData() {
        binding.rvListData.setHasFixedSize(true)
        binding.rvListData.layoutManager = LinearLayoutManager(this)

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
                binding.rvListData.adapter = adapter
            }

            override fun onFailure(call: Call<ArrayList<ListDataResponse>>, t: Throwable) {
                t.message?.let { Log.e("error", it) }
            }
        })
    }
}
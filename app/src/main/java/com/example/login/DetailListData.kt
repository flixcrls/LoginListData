package com.example.login

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.login.databinding.DetailListDataBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class DetailListData: AppCompatActivity() {

    private lateinit var binding: DetailListDataBinding

    private var list = ArrayList<DetailListDataResponse>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DetailListDataBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        showDetailListData()
    }


    private fun showDetailListData() {
        binding.rvPost.setHasFixedSize(true)
        binding.rvPost.layoutManager = LinearLayoutManager(this)

        RetrofitClient.instance.getPostsDetail("eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpZCI6Ijc5NThiNTA3YjQyMTg1ZDg1MjlkMjJkYTUxNmE5ZTI0ZWQ1MGNiYWI5YTAzYzIyYmRkNTY3NTJhMzJiMDBjMTllMzg2NWQ3YzA2YjhkMTU1NjgzMTkwNjIyZDc3M2RjMDRmMWE4ZGVkNzRlZmFlYjliMjAyMjQzNjMzOTQwZDIyVHJmdVBETGRTS0x0aXJyYXgraktMNEVaMkE9PSIsInVzZXJuYW1lIjoiRW5kaSBTdW1hcm5vIiwidG9rZW4iOiJDTTJ6b0NxNWk4Z1VaRU5nIiwidGltZXN0YW1wIjoxNjU4MTk1Njc4fQ.WZ0KWJ4Zpq359yJw-ZlgJN1hkgFQjG7kIY6fiDdFj2w",
        2574)
            .enqueue(object: Callback<ArrayList<DetailListDataResponse>> {
                override fun onResponse(
                    call: Call<ArrayList<DetailListDataResponse>>,
                    response: Response<ArrayList<DetailListDataResponse>>
                ) {
                    val listResponse = response.body()
                    listResponse?.let { list.addAll(it) }
                    val adapter = DetailListDataAdapter(list)
                    binding.rvPost.adapter = adapter
                }

                override fun onFailure(
                    call: Call<ArrayList<DetailListDataResponse>>,
                    t: Throwable
                ) {
                    t.message?.let { Log.e("error", it) }
                }

            })
    }
}

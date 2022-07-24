package com.example.login

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.login.listdata.ListDataResponse
import kotlinx.android.synthetic.main.detail_list_data.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class DetailListData: AppCompatActivity() {

    private val list = ArrayList<DetailListDataResponse>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail_list_data)

        rvPost.setHasFixedSize(true)
        rvPost.layoutManager = LinearLayoutManager(this)

        RetrofitClient.instance.getPostsDetail("eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpZCI6Ijc5NThiNTA3YjQyMTg1ZDg1MjlkMjJkYTUxNmE5ZTI0ZWQ1MGNiYWI5YTAzYzIyYmRkNTY3NTJhMzJiMDBjMTllMzg2NWQ3YzA2YjhkMTU1NjgzMTkwNjIyZDc3M2RjMDRmMWE4ZGVkNzRlZmFlYjliMjAyMjQzNjMzOTQwZDIyVHJmdVBETGRTS0x0aXJyYXgraktMNEVaMkE9PSIsInVzZXJuYW1lIjoiRW5kaSBTdW1hcm5vIiwidG9rZW4iOiJDTTJ6b0NxNWk4Z1VaRU5nIiwidGltZXN0YW1wIjoxNjU4MTk1Njc4fQ.WZ0KWJ4Zpq359yJw-ZlgJN1hkgFQjG7kIY6fiDdFj2w",
        1, 10, 1)
            .enqueue(object: Callback<ArrayList<ListDataResponse>> {
                override fun onResponse(
                    call: Call<ArrayList<ListDataResponse>>,
                    response: Response<ArrayList<ListDataResponse>>
                ) {
                    val listResponse = response.body()
                    response.body()?.let { listResponse?.addAll(it) }
                    val adapter = DetailListDataAdapter(list)
                    rvPost.adapter = adapter
                }

                override fun onFailure(call: Call<ArrayList<ListDataResponse>>, t: Throwable) {

                }

            })
    }
}

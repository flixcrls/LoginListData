package com.example.login.loginactivity

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.login.databinding.ActivityMainBinding
import com.example.login.listdata.ListData
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        initAction()
    }

    private fun initAction() {
        binding.btnLogin.setOnClickListener {
            login()
//            Intent(this, ListData::class.java).also {
//                startActivity(it)
//            }
        }
    }

    fun login() {
        val request = UserRequest()
        request.username = binding.etUsername.text.toString().trim()
        request.password = binding.etPassword.text.toString().trim()

        val retro = Retro().getRetroClientInstance().create(UserApi::class.java)
        retro.login(request).enqueue(object : Callback<UserResponse> {
            override fun onResponse(call: Call<UserResponse>, response: Response<UserResponse>) {
                val user = response.body()
//                Log.e("status", user?.status.toString())
//                Log.e("username", user?.username.toString())
//                Log.e("role", user?.role.toString())
//                Log.e("token", user?.token.toString())

//                user?.status.toString()
//                user?.username.toString()
//                user?.role.toString()
//                user?.token.toString()

                if (response.isSuccessful) {
                    startActivity(Intent(this@MainActivity, ListData::class.java))
                    finish()
                } else {
                    Toast.makeText(this@MainActivity, "kode driver atau password salah", Toast.LENGTH_LONG).show()
                }
            }

            override fun onFailure(call: Call<UserResponse>, t: Throwable) {
                t.message?.let { Log.e("error", it) }
            }

        })
    }
}
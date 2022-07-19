package com.example.login.loginactivity

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.login.*
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initAction()
    }

    private fun initAction() {
        btnLogin.setOnClickListener {
            login()
//            Intent(this, ListData::class.java).also {
//                startActivity(it)
//            }
        }
    }

    fun login() {
        val request = UserRequest()
        request.username = etUsername.text.toString().trim()
        request.password = etPassword.text.toString().trim()

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
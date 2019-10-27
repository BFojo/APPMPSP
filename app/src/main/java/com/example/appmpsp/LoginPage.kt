package com.example.appmpsp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class LoginPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_page)

        val loginButton: Button = findViewById(R.id.login_button)
        loginButton.setOnClickListener{
            val intent = Intent(this, MainActivity :: class.java)
            startActivity(intent)
        }
    }
}
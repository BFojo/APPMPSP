package com.example.appmpsp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.login_page.*
import org.w3c.dom.Text

class LoginPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_page)

        val loginButton: Button = findViewById(R.id.login_button)
        val loginMpsp: EditText = findViewById(R.id.login_mpsp)
        val senhaMpsp: EditText = findViewById(R.id.senha_mpsp)


        loginButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            if (senhaMpsp.text.toString().equals("1234") && loginMpsp.text.toString().equals("admin")) {
                startActivity(intent)
            } else {
                loginButton.setOnClickListener { view ->
                    Snackbar.make(view, "Email ou senha incorreto", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show()
                }

            }
        }
    }
}
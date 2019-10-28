
package com.example.appmpsp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.appmpsp.view.*
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val arpenspButton:Button = findViewById(R.id.arpenspButton)
        arpenspButton.setOnClickListener{
            val intent = Intent(this, ArpenspActivity :: class.java)
            startActivity(intent)
        }

        val cadespButton:Button = findViewById(R.id.cadespButton)
        cadespButton.setOnClickListener{
            val intent = Intent(this, CadespActivity :: class.java)
            startActivity(intent)
        }

        val detranButton:Button = findViewById(R.id.detranButton)
        detranButton.setOnClickListener{
            val intent = Intent(this, DetranActivity :: class.java)
            startActivity(intent)
        }
        val jucespButton:Button = findViewById(R.id.jucespButton)
        jucespButton.setOnClickListener{
            val intent = Intent(this, JucespActivity :: class.java)
            startActivity(intent)
        }
        val sielButton:Button = findViewById(R.id.sielButton)
        sielButton.setOnClickListener{
            val intent = Intent(this, SielActivity :: class.java)
            startActivity(intent)
        }
        val infocrimButton:Button = findViewById(R.id.infocrimButton)
        infocrimButton.setOnClickListener{
            val intent = Intent(this, InfocrimActivity :: class.java)
            startActivity(intent)
        }

        val sivecButton:Button = findViewById(R.id.sivecButton)
       sivecButton.setOnClickListener{
            val intent = Intent(this, SivecActivity :: class.java)
            startActivity(intent)
        }

        val censecButton:Button = findViewById(R.id.censecButton)
        censecButton.setOnClickListener{
            val intent = Intent(this, CensecActivity :: class.java)
            startActivity(intent)
        }

    }
}
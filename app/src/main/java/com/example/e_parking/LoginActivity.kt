package com.example.e_parking

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import android.view.View
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        val regis = findViewById<TextView>(R.id.regis)
        regis.setOnClickListener{
            val intent1 = Intent(this, MainActivity::class.java)
            startActivity(intent1)
        }


        val button2 = findViewById<ImageButton>(R.id.register_button)
        button2.setOnClickListener{
            val intent1 = Intent(this, MainActivity_Pengendara::class.java)
            startActivity(intent1)
        }
    }
    }
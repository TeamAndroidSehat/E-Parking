package com.example.e_parking

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_register.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        //Toast.makeText(this, "welcome",Toast.LENGTH_SHORT).show()
        //setContentView(R.layout.activity_register)

        register_button.setOnClickListener{
            setContentView(R.layout.activity_main)
        }

        val button1 = findViewById<TextView>(R.id.signup)
        button1.setOnClickListener{
            val intent1 = Intent(this, LoginActivity::class.java)
            startActivity(intent1)
        }

        /*
        signup.setOnClickListener{
            setContentView(R.layout.activity_main)
        }
        */
    }
}
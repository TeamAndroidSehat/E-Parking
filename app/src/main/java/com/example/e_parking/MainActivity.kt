package com.example.e_parking

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import com.example.e_parking.R.id.register_button
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_register.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        //Toast.makeText(this, "welcome",Toast.LENGTH_SHORT).show()
        //setContentView(R.layout.activity_register)

        val button2 = findViewById<ImageButton>(R.id.register_button)
        button2.setOnClickListener{
            val intent1 = Intent(this, LoginActivity::class.java)
            startActivity(intent1)
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
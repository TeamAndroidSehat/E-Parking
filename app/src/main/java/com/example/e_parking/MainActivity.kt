package com.example.e_parking

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this, "welcome",Toast.LENGTH_SHORT).show()
        setContentView(R.layout.activity_register)
    }
//    textView.setOnClickListener(new View.OnClickListener(){
//        public void onClick(View v){
//            Intent intent = new Intent(this, MainActivity.class);
//            startActivity(intent);
//        }
//    });
}
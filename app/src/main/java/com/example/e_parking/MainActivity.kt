package com.example.e_parking

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bottomNavigationView.background = null
        bottomNavigationView.menu.getItem(2).isEnabled = false
        
        val BerandaPengendaraFragment = Beranda_Pengendara()

        makeCurrentFragment(BerandaPengendaraFragment)
        bottomNavigationView.setOnNavigationItemReselectedListener {
            when(it.itemId){
                R.id.miHome -> makeCurrentFragment(BerandaPengendaraFragment)
            }
            true
        }

    }
    private fun makeCurrentFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fl_wrapper,fragment)
            commit()
        }
    }



}
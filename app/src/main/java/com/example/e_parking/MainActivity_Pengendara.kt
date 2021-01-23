package com.example.e_parking

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_pengendara_beranda.*

class MainActivity_Pengendara : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pengendara_beranda)
        bottomNavigationView.background = null
        bottomNavigationView.menu.getItem(1).isEnabled = false
        
        val BerandaPengendaraFragment = Beranda_Pengendara()
        val ProfilePengendaraFragment = Profile_Pengendara()

        makeCurrentFragment(BerandaPengendaraFragment)
        bottomNavigationView.setOnNavigationItemReselectedListener {
            when(it.itemId){
                R.id.miHome -> makeCurrentFragment(BerandaPengendaraFragment)
                R.id.miProfile -> makeCurrentFragment(ProfilePengendaraFragment)
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
package com.example.e_parking

import android.app.AlertDialog
import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.Window
import android.widget.Button
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.google.android.material.floatingactionbutton.FloatingActionButton
import kotlinx.android.synthetic.main.activity_pengendara_beranda.*

class MainActivity_Pengendara : AppCompatActivity() {
    var nama: FloatingActionButton? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_pengendara_beranda)
        bottomNavigationView.background = null
        bottomNavigationView.menu.getItem(2).isEnabled = false
//
//
//
//

        val BerandaPengendaraFragment = Beranda_Pengendara()
        val ProfilePengendaraFragment = Profile_Pengendara()
        val MapsFragment = MapsFragment()

        makeCurrentFragment(BerandaPengendaraFragment)
        bottomNavigationView.setOnNavigationItemReselectedListener {
            when (it.itemId) {
                R.id.miHome -> makeCurrentFragment(BerandaPengendaraFragment)
                R.id.miProfile -> makeCurrentFragment(ProfilePengendaraFragment)
                R.id.miParked -> makeCurrentFragment(MapsFragment)
            }
            true
        }

        fab.setOnClickListener {
//            makeCurrentFragment(BerandaPengendaraFragment)
            val intent = Intent(this, ScanBarcodeActivity::class.java);
            startActivity(intent)
        }
    }

    private fun makeCurrentFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().apply {
            setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
            replace(R.id.fl_wrapper, fragment)
            commit()
        }
    }

//    private fun showDialog(){
//        val dialog = Dialog(this)
//        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
//        dialog.setContentView(R.layout.dialog_image)
//        dialog.window.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
//    }


}
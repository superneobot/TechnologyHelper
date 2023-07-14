package com.sergeygolovin.technologyhelper

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import com.google.android.material.navigation.NavigationView
import com.sergeygolovin.technologyhelper.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)

        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.navView.setNavigationItemSelectedListener (this)


    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.id_tz -> {
                Toast.makeText(this, "TZ", Toast.LENGTH_SHORT).show()
                val openTZ = Intent(this, TZActivity::class.java)
                startActivity(openTZ)
                finish()
            }
            R.id.id_block -> Toast.makeText(this, "BLOCK", Toast.LENGTH_SHORT).show()
        }

        return true
    }
}
package com.sergeygolovin.technologyhelper

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import com.sergeygolovin.technologyhelper.databinding.ActivityMainBinding

class TZActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState, persistentState)
        setContentView(binding.root)




    }
}
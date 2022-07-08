package com.example.lesson4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lesson4.databinding.ActivityMainBinding
import com.example.lesson4.fragments.TopFragment

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportFragmentManager.beginTransaction().add(R.id.top_fragment, TopFragment()).commit()
        //supportFragmentManager.beginTransaction().add(R.id.bottom_fragment,BottomFragment()).commit()

    }
}
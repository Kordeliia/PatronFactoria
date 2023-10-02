package com.example.factoria

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.factoria.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var breadF = BreadFactory()
        var bread = breadF?.getBread("BAG")
        binding.tvPpal.text = bread?.name().toString()
    }
}
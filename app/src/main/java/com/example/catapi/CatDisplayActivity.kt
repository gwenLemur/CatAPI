package com.example.catapi

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.catapi.databinding.ActivityDisplayBinding
import com.example.catapi.models.CatObj

class CatDisplayActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDisplayBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDisplayBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val context = binding.layout.context
        val currCat = intent.getParcelableExtra<CatObj>("currCat" )



    }



}
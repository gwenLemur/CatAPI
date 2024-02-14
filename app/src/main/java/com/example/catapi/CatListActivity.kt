package com.example.catapi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.catapi.databinding.ActivityCatlistBinding

class CatListActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCatlistBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_catlist)
    }
}
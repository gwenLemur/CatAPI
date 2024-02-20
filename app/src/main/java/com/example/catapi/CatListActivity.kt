package com.example.catapi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.catapi.databinding.ActivityCatlistBinding

class CatListActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCatlistBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        //#TODO: Set up class architecture, get API call, set up adapter, view actvity
        //i did architecture but like ??
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_catlist)
    }
}
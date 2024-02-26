package com.example.catapi

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.catapi.databinding.ActivityDisplayBinding
import com.example.catapi.models.CatObj
import com.squareup.picasso.Picasso

class CatDisplayActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDisplayBinding

    companion object {
        val EXTRA_CAT = "currCat"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDisplayBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var parcel = intent.getParcelableExtra<CatObj>(EXTRA_CAT)
        var image = parcel?.image?.jpg
        var title = parcel?.title
        var code = parcel?.status_code

        val context = binding.layout.context
        val currCat = intent.getParcelableExtra<CatObj>("currCat" )
        binding.title.text = title
        binding.code.text = code.toString()
        Picasso.get().load(image).into(binding.image)

    }



}
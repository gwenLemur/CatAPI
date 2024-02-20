package com.example.catapi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.catapi.api.CatService
import com.example.catapi.api.RetrofitHelper
import com.example.catapi.databinding.ActivityCatlistBinding
import com.example.catapi.models.CatObj
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class CatListActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCatlistBinding
    private lateinit var adapter: CatAdapterActivity
    private lateinit var cats: CatObj

    override fun onCreate(savedInstanceState: Bundle?) {
        //#TODO: Set up class architecture, get API call, set up adapter, view actvity
        //i did architecture but like ??
        super.onCreate(savedInstanceState)
        binding = ActivityCatlistBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val catService = RetrofitHelper.getInstance().create(CatService::class.java)
        val catCall = catService.getCatData()

        catCall.enqueue(object: Callback<CatObj>{
            override fun onResponse(
                call: Call<CatObj>,
                response: Response<CatObj>
            ){
                cats = response.body()!!


            }
        }
    }
}
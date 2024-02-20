package com.example.catapi.api

import com.example.catapi.models.CatObj
import retrofit2.Call

interface CatService {
    fun getCatData(): Call<CatObj>

}
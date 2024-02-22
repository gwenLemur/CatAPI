package com.example.catapi.api

import com.example.catapi.models.CatObj
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface CatService {
    @GET("{id}.json")
    fun getCatData(@Path("id") catId: Int): Call<CatObj>

}
package com.example.catapi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
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
    private lateinit var catList: MutableList<CatObj>

    companion object{
        val TAG = "yay"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        //#TODO: Set up class architecture, get API call, set up adapter, view actvity
        //i did architecture but like ??
        super.onCreate(savedInstanceState)
        binding = ActivityCatlistBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val catService = RetrofitHelper.getInstance().create(CatService::class.java)
        var catCall = mutableListOf<Call<CatObj>>()
        var httpStatusList = mutableListOf(100, 101, 102, 103, 200, 201, 202, 203, 204, 205,
            206, 207, 208, 218, 226, 300, 301, 302, 303, 304, 305, 306, 307, 308, 400, 401, 402,
            403, 404, 405, 406, 407, 408, 409, 410, 411, 412, 413, 414, 415, 416, 417, 418, 419,
            420, 421, 422, 423, 424, 425, 426, 428, 429, 430, 431, 440, 444, 449, 450, 451, 460,
            463, 464, 494, 495, 496, 497, 498, 499, 500, 501, 502, 503, 504, 505, 506, 507, 508,
            509, 510, 511, 520, 521, 522, 523, 524, 525, 526, 527, 529, 530, 561, 598 ,599, 999)
            for (i in httpStatusList){
                catCall.add(catService.getCatData(i))
            }
        // TODO: make adapter w/ empty list, add each call to adapter, have adapter reload data
        catCall.forEach{
           it.enqueue(object: Callback<CatObj>{
                override fun onResponse(
                    call: Call<CatObj>,
                    response: Response<CatObj>
                ) {
                    cats = response.body()!!
                    catList.add(cats)
                    Log.d(TAG, "onResponse: ${response.body()}")
                }

                override fun onFailure(call: Call<CatObj>, t: Throwable) {
                    Log.d(TAG, "no: ${t.message}")
                }
            } )
        }
        adapter = CatAdapterActivity(catList)

//        catCall.enqueue(object: Callback<MutableList<CatObj>>{
//            override fun onResponse(
//                call: Call<MutableList<CatObj>>,
//                response: Response<MutableList<CatObj>>
//            ) {
//                cats = response.body()!!
//                adapter = CatAdapterActivity(cats)
//                Log.d(TAG, "onResponse: ${response.body()}")
//            }
//
//            override fun onFailure(call: Call<MutableList<CatObj>>, t: Throwable) {
//                Log.d(TAG, "no: ${t.message}")
//            }
//        } )
    }
}
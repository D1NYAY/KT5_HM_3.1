package com.example.kt5_hm_31

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitService {
    companion object{
        val retrofit = Retrofit.Builder().baseUrl("https://pixabay.com").
        addConverterFactory(GsonConverterFactory.create()).build()

        var api = retrofit.create(PixaApi::class.java)
    }

}
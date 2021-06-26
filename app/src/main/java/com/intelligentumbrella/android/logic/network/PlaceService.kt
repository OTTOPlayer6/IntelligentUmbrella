package com.intelligentumbrella.android.logic.network

import com.intelligentumbrella.android.IntelligentUmbrellaApplication
import com.intelligentumbrella.android.logic.model.PlaceResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface PlaceService {

    @GET("v2/place?token=${IntelligentUmbrellaApplication.TOKEN}&lang=zh_CN")
    fun searchPlaces(@Query("query") query: String): Call<PlaceResponse>

}
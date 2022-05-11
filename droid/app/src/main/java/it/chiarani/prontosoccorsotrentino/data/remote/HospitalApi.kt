package it.chiarani.prontosoccorsotrentino.data.remote

import okhttp3.ResponseBody
import retrofit2.http.GET

interface HospitalApi {
    @GET("/STATOPS001.json")
    suspend fun getHospitalStatusListings() : ResponseBody

    companion object {
        const val BASE_URL = "https://servizi.apss.tn.it/opendata"
    }
}
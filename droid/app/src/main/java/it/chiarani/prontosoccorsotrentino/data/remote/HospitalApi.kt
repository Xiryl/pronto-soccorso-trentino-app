package it.chiarani.prontosoccorsotrentino.data.remote

import it.chiarani.prontosoccorsotrentino.data.local.HospitalEntity
import okhttp3.ResponseBody
import retrofit2.http.GET

interface HospitalApi {
    @GET("/STATOPS001.json")
    suspend fun getHospitalStatusListings() : List<HospitalEntity>

    companion object {
        const val BASE_URL = "https://servizi.apss.tn.it/opendata"
    }
}
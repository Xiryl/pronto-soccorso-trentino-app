package it.chiarani.prontosoccorsotrentino.data.remote

import it.chiarani.prontosoccorsotrentino.data.local.HospitalListEntity
import retrofit2.http.GET

interface HospitalApi {
    @GET("STATOPS001.json")
    suspend fun getHospitalStatusListings() : List<HospitalListEntity>

    companion object {
        const val BASE_URL = "https://servizi.apss.tn.it/opendata/"
    }
}
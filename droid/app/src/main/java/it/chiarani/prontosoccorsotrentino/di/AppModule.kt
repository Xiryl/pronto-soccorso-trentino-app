package it.chiarani.prontosoccorsotrentino.di

import android.app.Application
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import it.chiarani.prontosoccorsotrentino.data.local.HospitalDatabase
import it.chiarani.prontosoccorsotrentino.data.remote.HospitalApi
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun provideHospitalApi(): HospitalApi {
        return Retrofit.Builder()
            .baseUrl(HospitalApi.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create()
    }

    @Provides
    @Singleton
    fun provideHospitalDatabase(app: Application): HospitalDatabase {
        return Room.databaseBuilder(
            app,
            HospitalDatabase::class.java,
            "ProntoSoccorsoTrentino.db"
        ).build()
    }
}
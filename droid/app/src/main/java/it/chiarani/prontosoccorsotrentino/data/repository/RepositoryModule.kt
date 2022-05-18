package it.chiarani.prontosoccorsotrentino.data.repository

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import it.chiarani.prontosoccorsotrentino.domain.repository.HospitalRepository
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindHospitalRespository(
        hospitalRepositoryImpl: HospitalRepositoryImpl
    ): HospitalRepository
}
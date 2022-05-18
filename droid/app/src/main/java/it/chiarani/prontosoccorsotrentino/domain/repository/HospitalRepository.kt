package it.chiarani.prontosoccorsotrentino.domain.repository

import it.chiarani.prontosoccorsotrentino.domain.model.Hospital
import it.chiarani.prontosoccorsotrentino.util.Resource
import kotlinx.coroutines.flow.Flow

interface HospitalRepository {
    suspend fun getHospitalData(
        fetchFromRemote: Boolean,
        query: String
    ): Flow<Resource<List<Hospital>>>
}
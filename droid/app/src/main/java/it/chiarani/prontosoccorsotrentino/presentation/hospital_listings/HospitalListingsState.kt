package it.chiarani.prontosoccorsotrentino.presentation.hospital_listings

import it.chiarani.prontosoccorsotrentino.domain.model.Hospital

data class HospitalListingsState(
    val hospitals: List<Hospital> = emptyList(),
    val isLoading: Boolean = false,
    val isRefreshing: Boolean = false,
    val searchQuery: String = ""
)

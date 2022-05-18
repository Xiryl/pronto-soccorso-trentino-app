package it.chiarani.prontosoccorsotrentino.presentation.hospital_listings

sealed class HospitalListingsEvent {
    object Refresh: HospitalListingsEvent()
    data class OnSearchQueryChange(val query: String): HospitalListingsEvent()
}
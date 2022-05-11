package it.chiarani.prontosoccorsotrentino.domain.model

import com.google.gson.annotations.SerializedName


/**
 * Plain kotlin class for [it.chiarani.prontosoccorsotrentino.data.local.HospitalAverageWaitingListEntity]
 */
data class HospitalAverageWaitingList(
    val white: String,
    val green: String,
    val azure: String,
    val orange: String,
    val yellow: String,
    val red: String,
)

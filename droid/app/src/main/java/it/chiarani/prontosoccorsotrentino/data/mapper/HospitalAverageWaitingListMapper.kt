package it.chiarani.prontosoccorsotrentino.data.mapper

import it.chiarani.prontosoccorsotrentino.data.local.HospitalAverageWaitingListEntity
import it.chiarani.prontosoccorsotrentino.data.local.HospitalEntity
import it.chiarani.prontosoccorsotrentino.domain.model.Hospital
import it.chiarani.prontosoccorsotrentino.domain.model.HospitalAverageWaitingList

/***
 * Extension function to map the [HospitalAverageWaitingListEntity] (entity) to [HospitalAverageWaitingList] (model)
 */

fun HospitalAverageWaitingListEntity.toHospitalAverageWaitingList(): HospitalAverageWaitingList {
    return HospitalAverageWaitingList(
        red = red,
        green = green,
        yellow = yellow,
        azure = azure,
        white = white,
        orange = orange
    )
}

/***
 * Extension function to map the [HospitalAverageWaitingList] (model) to [HospitalAverageWaitingListEntity] (entity)
 */

fun HospitalAverageWaitingList.toHospitalAverageWaitingListEntity(): HospitalAverageWaitingListEntity {
    return HospitalAverageWaitingListEntity(
        red = red,
        green = green,
        yellow = yellow,
        azure = azure,
        white = white,
        orange = orange
    )
}
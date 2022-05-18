package it.chiarani.prontosoccorsotrentino.data.mapper

import it.chiarani.prontosoccorsotrentino.data.local.HospitalListEntity
import it.chiarani.prontosoccorsotrentino.domain.model.HospitalList

/***
 * Extension function to map the [_root_ide_package_.it.chiarani.prontosoccorsotrentino.data.local.HospitalListEntity] (entity) to [_root_ide_package_.it.chiarani.prontosoccorsotrentino.domain.model.HospitalList] (model)
 */

fun HospitalListEntity.toHospitalList(): HospitalList {
    return HospitalList(
        hospitalResponse = hospitalResponseEntity?.toHospitalResponse()
    )
}

/***
 * Extension function to map the [_root_ide_package_.it.chiarani.prontosoccorsotrentino.domain.model.HospitalList] (model) to [_root_ide_package_.it.chiarani.prontosoccorsotrentino.data.local.HospitalListEntity] (entity)
 */

fun HospitalList.toHospitalListEntity(): HospitalListEntity {
    return HospitalListEntity(
        hospitalResponseEntity = hospitalResponse?.toHospitalResponseEntity()
    )
}
package it.chiarani.prontosoccorsotrentino.data.mapper

import it.chiarani.prontosoccorsotrentino.data.local.HospitalResponseEntity
import it.chiarani.prontosoccorsotrentino.domain.model.Department
import it.chiarani.prontosoccorsotrentino.domain.model.HospitalResponse


/***
 * Extension function to map the [_root_ide_package_.it.chiarani.prontosoccorsotrentino.data.local.HospitalResponseEntity] (entity) to [_root_ide_package_.it.chiarani.prontosoccorsotrentino.domain.model.HospitalResponse] (model)
 */

fun HospitalResponseEntity.toHospitalResponse(): HospitalResponse {
    return HospitalResponse(
        department = departmentEntity?.toDepartment(),
        timestamp = timestamp,
        type = type
    )
}

/***
 * Extension function to map the [_root_ide_package_.it.chiarani.prontosoccorsotrentino.domain.model.HospitalResponse] (model) to [_root_ide_package_.it.chiarani.prontosoccorsotrentino.data.local.HospitalResponseEntity] (entity)
 */

fun HospitalResponse.toHospitalResponseEntity(): HospitalResponseEntity {
    return HospitalResponseEntity(
        departmentEntity = department?.toDepartmentEntity(),
        timestamp = timestamp,
        type = type
    )
}
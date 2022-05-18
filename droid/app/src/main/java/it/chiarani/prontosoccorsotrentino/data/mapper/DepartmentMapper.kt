package it.chiarani.prontosoccorsotrentino.data.mapper

import it.chiarani.prontosoccorsotrentino.data.local.DepartmentEntity
import it.chiarani.prontosoccorsotrentino.domain.model.Department

/***
 * Extension function to map the [_root_ide_package_.it.chiarani.prontosoccorsotrentino.data.local.DepartmentEntity] (entity) to [_root_ide_package_.it.chiarani.prontosoccorsotrentino.domain.model.Department] (model)
 */

fun DepartmentEntity.toDepartment(): Department {
    return Department(
        hospital = hospital?.toHospital()
    )
}

/***
 * Extension function to map the [_root_ide_package_.it.chiarani.prontosoccorsotrentino.domain.model.Department] (model) to [_root_ide_package_.it.chiarani.prontosoccorsotrentino.data.local.DepartmentEntity] (entity)
 */

fun Department.toDepartmentEntity(): DepartmentEntity {
    return DepartmentEntity(
        hospital = hospital?.toHospitalEntity()
    )
}
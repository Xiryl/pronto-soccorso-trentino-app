package it.chiarani.prontosoccorsotrentino.data.converter

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import it.chiarani.prontosoccorsotrentino.data.local.DepartmentEntity

class DepartmentConverter {
    @TypeConverter
    fun fromString(value: String?): DepartmentEntity? {
        val listType = object : TypeToken<DepartmentEntity?>() {}.type
        return Gson().fromJson(value, listType)
    }

    @TypeConverter
    fun fromDepartmentEntity(data: DepartmentEntity?): String? {
        val gson = Gson()
        return gson.toJson(data)
    }
}
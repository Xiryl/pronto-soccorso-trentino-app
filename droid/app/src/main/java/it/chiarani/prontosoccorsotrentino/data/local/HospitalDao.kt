package it.chiarani.prontosoccorsotrentino.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

/**
 * Represent the functions that interacts with room db
 */
@Dao
interface HospitalDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertHospitalListings(
        hospitalEntity: HospitalEntity
    )

    @Query("DELETE FROM hospitalentity")
    suspend fun clearHospitalListings()

    @Query(
        """
        SELECT *
        FROM hospitalentity
        WHERE LOWER(description) LIKE '%' || LOWER(:query) || '%' OR UPPER(:query) == description
    """
    )
    suspend fun searchHospitalEntity(query: String): List<HospitalEntity>
}
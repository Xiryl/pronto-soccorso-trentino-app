package it.chiarani.prontosoccorsotrentino.data.repository

import it.chiarani.prontosoccorsotrentino.data.local.HospitalDatabase
import it.chiarani.prontosoccorsotrentino.data.mapper.toHospital
import it.chiarani.prontosoccorsotrentino.data.mapper.toHospitalList
import it.chiarani.prontosoccorsotrentino.data.remote.HospitalApi
import it.chiarani.prontosoccorsotrentino.domain.model.Hospital
import it.chiarani.prontosoccorsotrentino.domain.model.HospitalList
import it.chiarani.prontosoccorsotrentino.domain.repository.HospitalRepository
import it.chiarani.prontosoccorsotrentino.util.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class HospitalRepositoryImpl @Inject constructor(
    private val api: HospitalApi,
    private val db: HospitalDatabase
) : HospitalRepository {

    private val dao = db.dao

    override suspend fun getHospitalData(
        fetchFromRemote: Boolean,
        query: String
    ): Flow<Resource<List<Hospital>>> {
        return flow {
            emit(Resource.Loading(true))

            val localHospital = dao.searchHospitalEntity(query = query)

            emit(Resource.Success(localHospital.map {
                it.toHospital()
            }))

            // Check if API request is needed
            val isDbEmpty = localHospital.isEmpty() && query.isBlank()
            val shouldJustLoadFromCache = !isDbEmpty && !fetchFromRemote

            if (shouldJustLoadFromCache) {
                emit(Resource.Loading(false))
                return@flow
            }

            // Make api call
            val remoteHospitals = try {
                val response = api.getHospitalStatusListings()
                response
            } catch (e: IOException) {
                // eg. wrong parsing
                e.printStackTrace()
                emit(Resource.Error("Couldn't load data"))
                null
            } catch (e: HttpException) {
                // eg. connection errors
                e.printStackTrace()
                emit(Resource.Error("Couldn't load data"))
                null
            }

            remoteHospitals?.let { hospital ->
                dao.clearHospitalListings()
                for (h in hospital) {
                    dao.insertHospitalListings(h.hospitalResponseEntity?.departmentEntity?.hospital!!)
                }


                val dd = dao
                    .searchHospitalEntity("")
                    .map {
                        it.toHospital()
                    }
                // data always come from cache
                emit(
                    Resource.Success(
                        data = dd)
                )
                emit(Resource.Loading(false))
            }
        }
    }

}
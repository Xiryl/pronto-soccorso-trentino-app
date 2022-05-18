package it.chiarani.prontosoccorsotrentino.presentation.hospital_listings

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import it.chiarani.prontosoccorsotrentino.domain.repository.HospitalRepository
import it.chiarani.prontosoccorsotrentino.util.Resource
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HospitalListingsViewModel @Inject constructor(
    private val repository: HospitalRepository,
) : ViewModel() {
    var state by mutableStateOf(HospitalListingsState())

    private var searchJob: Job? = null

    init {
        getHospitalData(fetchFromRemote = true)
    }

    fun onEvent(event: HospitalListingsEvent) {
        when (event) {
            is HospitalListingsEvent.Refresh -> {
                // re-fetch data from API
                getHospitalData(fetchFromRemote = true)
            }

            is HospitalListingsEvent.OnSearchQueryChange -> {
                // search using a query
                state = state.copy(
                    searchQuery = event.query
                )
                searchJob?.cancel()
                searchJob = viewModelScope.launch {
                    delay(500L)
                    getHospitalData(query = event.query)
                }
            }
        }
    }

    private fun getHospitalData(
        query: String = state.searchQuery.lowercase(),
        fetchFromRemote: Boolean = false
    ) {
        viewModelScope.launch {
            repository.getHospitalData(fetchFromRemote = fetchFromRemote, query = query)
                .collect { result ->
                    when (result) {
                        is Resource.Success -> {
                            result.data?.let { listings ->
                                state = state.copy(hospitals = listings)
                            }
                        }
                        is Resource.Error -> Unit
                        is Resource.Loading -> {
                            state = state.copy(isLoading = result.isLoading)
                        }
                    }
                }
        }
    }
}
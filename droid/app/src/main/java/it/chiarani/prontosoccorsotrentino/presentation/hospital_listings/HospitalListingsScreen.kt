package it.chiarani.prontosoccorsotrentino.presentation.hospital_listings

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.google.accompanist.swiperefresh.SwipeRefresh
import com.google.accompanist.swiperefresh.rememberSwipeRefreshState
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator

@Composable
@Destination(start = true)
fun HospitalListingsScreen(
    navigator: DestinationsNavigator,
    viewModel: HospitalListingsViewModel = hiltViewModel()
) {

    val swipeRefreshState = rememberSwipeRefreshState(isRefreshing = viewModel.state.isRefreshing)
    val state = viewModel.state
    var selectedIndex = remember { mutableStateOf(0) }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colors.primaryVariant),
    ) {
        OutlinedTextField(
            value = state.searchQuery, onValueChange = {
                viewModel.onEvent(HospitalListingsEvent.OnSearchQueryChange(it))
            },
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),
            placeholder = {
                Text(text = "Cerca Ospedale ...")
            },
            maxLines = 1,
            singleLine = true
        )
        SwipeRefresh(
            state = swipeRefreshState,
            onRefresh = { viewModel.onEvent(HospitalListingsEvent.Refresh) }
        ) {
            LazyColumn(modifier = Modifier.fillMaxSize()) {
                val sortedHospital = state.hospitals.sortedBy { it.description }
                items(sortedHospital.size) { i ->
                    val hospital = sortedHospital[i]

                    if(selectedIndex.value == i) {
                        HospitalItemSelected(
                            index = i,
                            onClickEvent = { selectedIndex.value = it },
                            selected = selectedIndex.value,
                            hospital = hospital,
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(14.dp)
                                .clip(RoundedCornerShape(4.dp))

                        )
                    } else {
                        HospitalItem(
                            index = i,
                            onClickEvent = { selectedIndex.value = it },
                            selected = selectedIndex.value,
                            hospital = hospital,
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(14.dp)
                                .clip(RoundedCornerShape(4.dp))

                        )
                    }
                }
            }
        }
    }

}
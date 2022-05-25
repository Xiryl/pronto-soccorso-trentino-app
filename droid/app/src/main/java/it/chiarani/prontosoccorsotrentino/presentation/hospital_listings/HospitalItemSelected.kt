package it.chiarani.prontosoccorsotrentino.presentation.hospital_listings

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import it.chiarani.prontosoccorsotrentino.R
import it.chiarani.prontosoccorsotrentino.domain.model.Hospital
import it.chiarani.prontosoccorsotrentino.ui.theme.Orange
import kotlin.time.Duration


fun formatTime(t: Int): String {
    var hours = t / 3600
    var minutes = (t % 3600) / 60
    var seconds = t % 60

    return "$hours,$minutes h"
}

@Composable
fun HospitalItemSelected(
    index: Int,
    selected: Int,
    hospital: Hospital,
    modifier: Modifier = Modifier,
    onClickEvent: (Int) -> Unit,
) {
    Row(
        modifier = modifier
            .clickable {
                onClickEvent.invoke(index)
            }
            .background(MaterialTheme.colors.secondary),
        verticalAlignment = Alignment.CenterVertically,

        ) {
        Column(modifier = modifier.weight(1f)) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = hospital.description!!,
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 14.sp,
                    color = MaterialTheme.colors.onBackground,
                    overflow = TextOverflow.Ellipsis,
                    maxLines = 1,
                    modifier = Modifier.weight(1f)
                )
                Spacer(modifier = Modifier.width(4.dp))
                Text(
                    text = hospital.location!!,
                    fontSize = 11.sp,
                    fontWeight = FontWeight.Normal,
                    color = MaterialTheme.colors.onBackground
                )
                if (!hospital.customMessage.isNullOrEmpty()) {
                    Image(
                        painter = painterResource(id = R.drawable.ic_info),
                        contentDescription = "Extra message"
                    )
                }
            }
            Spacer(modifier = modifier.height(4.dp))
            Text(
                text = "In attesa:",
                fontWeight = FontWeight.Normal,
                color = MaterialTheme.colors.onBackground,
            )
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {

                Card(
                    elevation = 1.dp,
                    border = BorderStroke(1.dp, Color.LightGray)
                ) {
                    Row(
                        modifier = Modifier
                            .wrapContentWidth()
                            .padding(8.dp, 2.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween,

                        ) {
                        Canvas(
                            modifier = Modifier
                                .size(16.dp)
                                .border(
                                    BorderStroke(2.dp, Color.LightGray),
                                    shape = CircleShape
                                ),
                            onDraw = {
                                drawCircle(color = Color.White)
                            })
                        Text(
                            modifier = Modifier.padding(horizontal = 4.dp),
                            text = hospital.waitingListEntity!!.white,
                            fontWeight = FontWeight.SemiBold,
                        )
                    }
                }

                Card(
                    elevation = 1.dp,
                    border = BorderStroke(1.dp, Color.LightGray)
                ) {
                    Row(
                        modifier = Modifier
                            .wrapContentWidth()
                            .padding(8.dp, 2.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween,

                        ) {
                        Canvas(modifier = Modifier.size(16.dp), onDraw = {
                            drawCircle(color = Color.Green)
                        })
                        Text(
                            modifier = Modifier.padding(horizontal = 4.dp),
                            text = hospital.waitingListEntity!!.green,
                            fontWeight = FontWeight.SemiBold,
                        )
                    }
                }


                Card(
                    elevation = 1.dp,
                    border = BorderStroke(1.dp, Color.LightGray)
                ) {
                    Row(
                        modifier = Modifier
                            .wrapContentWidth()
                            .padding(8.dp, 2.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween,

                        ) {
                        Canvas(modifier = Modifier.size(16.dp), onDraw = {
                            drawCircle(color = Color.Cyan)
                        })
                        Text(
                            modifier = Modifier.padding(horizontal = 4.dp),
                            text = hospital.waitingListEntity!!.azure,
                            fontWeight = FontWeight.SemiBold,
                        )
                    }
                }

                Card(
                    elevation = 1.dp,
                    border = BorderStroke(1.dp, Color.LightGray)
                ) {
                    Row(
                        modifier = Modifier
                            .wrapContentWidth()
                            .padding(8.dp, 2.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween,

                        ) {
                        Canvas(modifier = Modifier.size(16.dp), onDraw = {
                            drawCircle(color = Color.Yellow)
                        })
                        Text(
                            modifier = Modifier.padding(horizontal = 4.dp),
                            text = hospital.waitingListEntity!!.yellow,
                            fontWeight = FontWeight.SemiBold,
                        )
                    }
                }


                Card(
                    elevation = 1.dp,
                    border = BorderStroke(1.dp, Color.LightGray)
                ) {
                    Row(
                        modifier = Modifier
                            .wrapContentWidth()
                            .padding(8.dp, 2.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween,

                        ) {
                        Canvas(modifier = Modifier.size(16.dp), onDraw = {
                            drawCircle(color = Orange)
                        })
                        Text(
                            modifier = Modifier.padding(horizontal = 4.dp),
                            text = hospital.waitingListEntity!!.orange,
                            fontWeight = FontWeight.SemiBold,
                        )
                    }
                }


                Card(
                    elevation = 1.dp,
                    border = BorderStroke(1.dp, Color.LightGray)
                ) {
                    Row(
                        modifier = Modifier
                            .wrapContentWidth()
                            .padding(8.dp, 2.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween,

                        ) {
                        Canvas(modifier = Modifier.size(16.dp), onDraw = {
                            drawCircle(color = Color.Red)
                        })
                        Text(
                            modifier = Modifier.padding(horizontal = 4.dp),
                            text = hospital.waitingListEntity!!.red,
                            fontWeight = FontWeight.SemiBold,
                        )
                    }
                }


            }

            // ----- INIZIO AMBULATORIO ------

            Text(
                text = "In Ambulatorio:",
                fontWeight = FontWeight.Normal,
                color = MaterialTheme.colors.onBackground,
            )
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {

                Card(
                    elevation = 1.dp,
                    border = BorderStroke(1.dp, Color.LightGray)
                ) {
                    Row(
                        modifier = Modifier
                            .wrapContentWidth()
                            .padding(8.dp, 2.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween,

                        ) {
                        Canvas(
                            modifier = Modifier
                                .size(16.dp)
                                .border(
                                    BorderStroke(2.dp, Color.LightGray),
                                    shape = CircleShape
                                ),
                            onDraw = {
                                drawCircle(color = Color.White)
                            })
                        Text(
                            modifier = Modifier.padding(horizontal = 4.dp),
                            text = hospital.waitingListSurgeryRoomEntity!!.white,
                            fontWeight = FontWeight.SemiBold,
                        )
                    }
                }

                Card(
                    elevation = 1.dp,
                    border = BorderStroke(1.dp, Color.LightGray)
                ) {
                    Row(
                        modifier = Modifier
                            .wrapContentWidth()
                            .padding(8.dp, 2.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween,

                        ) {
                        Canvas(modifier = Modifier.size(16.dp), onDraw = {
                            drawCircle(color = Color.Green)
                        })
                        Text(
                            modifier = Modifier.padding(horizontal = 4.dp),
                            text = hospital.waitingListSurgeryRoomEntity!!.green,
                            fontWeight = FontWeight.SemiBold,
                        )
                    }
                }


                Card(
                    elevation = 1.dp,
                    border = BorderStroke(1.dp, Color.LightGray)
                ) {
                    Row(
                        modifier = Modifier
                            .wrapContentWidth()
                            .padding(8.dp, 2.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween,

                        ) {
                        Canvas(modifier = Modifier.size(16.dp), onDraw = {
                            drawCircle(color = Color.Cyan)
                        })
                        Text(
                            modifier = Modifier.padding(horizontal = 4.dp),
                            text = hospital.waitingListSurgeryRoomEntity!!.azure,
                            fontWeight = FontWeight.SemiBold,
                        )
                    }
                }

                Card(
                    elevation = 1.dp,
                    border = BorderStroke(1.dp, Color.LightGray)
                ) {
                    Row(
                        modifier = Modifier
                            .wrapContentWidth()
                            .padding(8.dp, 2.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween,

                        ) {
                        Canvas(modifier = Modifier.size(16.dp), onDraw = {
                            drawCircle(color = Color.Yellow)
                        })
                        Text(
                            modifier = Modifier.padding(horizontal = 4.dp),
                            text = hospital.waitingListSurgeryRoomEntity!!.yellow,
                            fontWeight = FontWeight.SemiBold,
                        )
                    }
                }


                Card(
                    elevation = 1.dp,
                    border = BorderStroke(1.dp, Color.LightGray)
                ) {
                    Row(
                        modifier = Modifier
                            .wrapContentWidth()
                            .padding(8.dp, 2.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween,

                        ) {
                        Canvas(modifier = Modifier.size(16.dp), onDraw = {
                            drawCircle(color = Orange)
                        })
                        Text(
                            modifier = Modifier.padding(horizontal = 4.dp),
                            text = hospital.waitingListSurgeryRoomEntity!!.orange,
                            fontWeight = FontWeight.SemiBold,
                        )
                    }
                }


                Card(
                    elevation = 1.dp,
                    border = BorderStroke(1.dp, Color.LightGray)
                ) {
                    Row(
                        modifier = Modifier
                            .wrapContentWidth()
                            .padding(8.dp, 2.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween,

                        ) {
                        Canvas(modifier = Modifier.size(16.dp), onDraw = {
                            drawCircle(color = Color.Red)
                        })
                        Text(
                            modifier = Modifier.padding(horizontal = 4.dp),
                            text = hospital.waitingListSurgeryRoomEntity!!.red,
                            fontWeight = FontWeight.SemiBold,
                        )
                    }
                }
            }
            // ----- INIZIO OSSERVAZIONE ------

            Text(
                text = "In Osservazione:",
                fontWeight = FontWeight.Normal,
                color = MaterialTheme.colors.onBackground,
            )
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {

                Card(
                    elevation = 1.dp,
                    border = BorderStroke(1.dp, Color.LightGray)
                ) {
                    Row(
                        modifier = Modifier
                            .wrapContentWidth()
                            .padding(8.dp, 2.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween,

                        ) {
                        Canvas(
                            modifier = Modifier
                                .size(16.dp)
                                .border(
                                    BorderStroke(2.dp, Color.LightGray),
                                    shape = CircleShape
                                ),
                            onDraw = {
                                drawCircle(color = Color.White)
                            })
                        Text(
                            modifier = Modifier.padding(horizontal = 4.dp),
                            text = hospital.waitingListObservationRoomEntity!!.white,
                            fontWeight = FontWeight.SemiBold,
                        )
                    }
                }

                Card(
                    elevation = 1.dp,
                    border = BorderStroke(1.dp, Color.LightGray)
                ) {
                    Row(
                        modifier = Modifier
                            .wrapContentWidth()
                            .padding(8.dp, 2.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween,

                        ) {
                        Canvas(modifier = Modifier.size(16.dp), onDraw = {
                            drawCircle(color = Color.Green)
                        })
                        Text(
                            modifier = Modifier.padding(horizontal = 4.dp),
                            text = hospital.waitingListObservationRoomEntity!!.green,
                            fontWeight = FontWeight.SemiBold,
                        )
                    }
                }


                Card(
                    elevation = 1.dp,
                    border = BorderStroke(1.dp, Color.LightGray)
                ) {
                    Row(
                        modifier = Modifier
                            .wrapContentWidth()
                            .padding(8.dp, 2.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween,

                        ) {
                        Canvas(modifier = Modifier.size(16.dp), onDraw = {
                            drawCircle(color = Color.Cyan)
                        })
                        Text(
                            modifier = Modifier.padding(horizontal = 4.dp),
                            text = hospital.waitingListObservationRoomEntity!!.azure,
                            fontWeight = FontWeight.SemiBold,
                        )
                    }
                }

                Card(
                    elevation = 1.dp,
                    border = BorderStroke(1.dp, Color.LightGray)
                ) {
                    Row(
                        modifier = Modifier
                            .wrapContentWidth()
                            .padding(8.dp, 2.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween,

                        ) {
                        Canvas(modifier = Modifier.size(16.dp), onDraw = {
                            drawCircle(color = Color.Yellow)
                        })
                        Text(
                            modifier = Modifier.padding(horizontal = 4.dp),
                            text = hospital.waitingListObservationRoomEntity!!.yellow,
                            fontWeight = FontWeight.SemiBold,
                        )
                    }
                }


                Card(
                    elevation = 1.dp,
                    border = BorderStroke(1.dp, Color.LightGray)
                ) {
                    Row(
                        modifier = Modifier
                            .wrapContentWidth()
                            .padding(8.dp, 2.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween,

                        ) {
                        Canvas(modifier = Modifier.size(16.dp), onDraw = {
                            drawCircle(color = Orange)
                        })
                        Text(
                            modifier = Modifier.padding(horizontal = 4.dp),
                            text = hospital.waitingListObservationRoomEntity!!.orange,
                            fontWeight = FontWeight.SemiBold,
                        )
                    }
                }


                Card(
                    elevation = 1.dp,
                    border = BorderStroke(1.dp, Color.LightGray)
                ) {
                    Row(
                        modifier = Modifier
                            .wrapContentWidth()
                            .padding(8.dp, 2.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween,

                        ) {
                        Canvas(modifier = Modifier.size(16.dp), onDraw = {
                            drawCircle(color = Color.Red)
                        })
                        Text(
                            modifier = Modifier.padding(horizontal = 4.dp),
                            text = hospital.waitingListObservationRoomEntity!!.red,
                            fontWeight = FontWeight.SemiBold,
                        )
                    }
                }
            }

            Spacer(modifier = modifier.height(4.dp))
            // ---- INFO AGGIUNTIVE ----
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {

                if (!hospital.code.isNullOrEmpty()) {
                    Text(
                        text = "Codice: ${hospital.code}",
                        fontWeight = FontWeight.Normal,
                        color = MaterialTheme.colors.onBackground,
                        modifier = Modifier.weight(1f)
                    )
                }
            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                if (!hospital.hospitalName.isNullOrEmpty()) {
                    Text(
                        text = "Unita Operativa: ${hospital.hospitalName}",
                        fontWeight = FontWeight.Normal,
                        color = MaterialTheme.colors.onBackground,
                        modifier = Modifier.weight(1f)
                    )
                }
            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                if (!hospital.customMessage.isNullOrEmpty()) {
                    Text(
                        text = "Info: ${hospital.customMessage!!}",
                        fontWeight = FontWeight.Normal,
                        fontStyle = FontStyle.Italic,
                        color = MaterialTheme.colors.onBackground,
                        modifier = Modifier.weight(1f)
                    )
                }
            }


        }

    }
}

package it.chiarani.prontosoccorsotrentino.presentation.hospital_listings

import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import it.chiarani.prontosoccorsotrentino.domain.model.Hospital

@Composable
fun HospitalItem(
    hospital: Hospital,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column(modifier = modifier.weight(1f)) {
            Row(
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = "${hospital.hospitalName}",
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp,
                    color = MaterialTheme.colors.onBackground,
                    overflow = TextOverflow.Ellipsis,
                    maxLines = 1,
                    modifier = Modifier.weight(1f)
                )
                Spacer(modifier = modifier.width(4.dp))
                Text(
                    text = "${hospital.code}",
                    fontWeight = FontWeight.Light,
                    color = MaterialTheme.colors.onBackground
                )
            }
            Spacer(modifier = modifier.height(10.dp))
            Text(
                text = "${hospital.description}",
                fontWeight = FontWeight.SemiBold,
                color = MaterialTheme.colors.onBackground
            )
        }
    }
}
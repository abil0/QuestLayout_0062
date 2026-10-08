package com.example.pertemuan4

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp


@composable
fun ActivitasPertama(modifier: Modifier) {
    column(
        modifier = modifier.padding(top = 100.dp)
        fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        text(
            stringResource(R.string.prodi),
            fontSize = 35.sp,
            fontWeight = FontWeight.Bold,
        )
        text (
            stringResource(R.string.univ),
            fontSize = 22.sp
        )
        spacer(modifier = Modifier .height(25.dp))
        Card(
            modifier = Modifier
                .fillMaxWidth(1f)
                .padding(12.dp)
            Colors = CardDefaults.cardColors(
                containerColor = colorResource(R.Color.card_0_bg)
            )
        ) {
            Row(){
                valgambar = painterResource(R.drawable.Logo Umy)
                image(
                    painter = gambar,
                    contentDescription = null,
                    modifier = Modifier.size(100.dp).padding(5.dp)
                )
                spacer(modifier = Modifier.width(30.dp))
                column() {
                    text(
                        stringResource("Nabil Rafif"),
                        fontSize = 30.dp
                        fontFamily =FontFamily.Cursive
                    )
                }


            }
        }


    }

}


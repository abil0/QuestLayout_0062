package com.example.pertemuan4

import androidx.compose.ui.res.stringResource


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
        Card()


    }

}


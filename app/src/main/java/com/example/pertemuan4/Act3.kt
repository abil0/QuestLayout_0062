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
    }

}


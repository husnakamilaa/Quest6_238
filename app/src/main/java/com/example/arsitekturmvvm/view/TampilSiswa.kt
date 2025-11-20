package com.example.arsitekturmvvm.view

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.core.util.Pair
import com.example.arsitekturmvvm.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TampilSiswa(
    statusUiSiswa: siswa,
    onBackButtonClicked:() ->Unit,
){
    val items = listOf(
        Pair(first = stringResource(R.string.nama_lengkap), second = statusUiSiswa.nama),
        Pair(first = stringResource(R.string.gender), second = statusUiSiswa.gender),
        Pair(first = stringResource(R.string.alamat), second = statusUiSiswa.alamat),
    )
}
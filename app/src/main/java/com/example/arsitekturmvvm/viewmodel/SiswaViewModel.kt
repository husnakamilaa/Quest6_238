package com.example.arsitekturmvvm.viewmodel

import androidx.lifecycle.ViewModel
import com.example.arsitekturmvvm.model.Siswa
import kotlinx.coroutines.flow.StateFlow

class SiswaViewModel : ViewModel() {
    private val _statusUI = MutableStateflow(value = Siswa())

    val statusUI : StateFlow<Siswa> = _statusUI.asStateflow()
}
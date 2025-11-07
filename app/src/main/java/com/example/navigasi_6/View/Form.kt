package com.example.navigasi_6.View

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FormIsian(
    jenisK:List<String> = Listof("Laki-laki","Perempuan"),
    OnSubmitBtnClick:()-> Unit
){
    Scaffold(modifier = Modifier) {  }
}

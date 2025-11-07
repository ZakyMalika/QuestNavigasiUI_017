package com.example.navigasi_6.View

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import com.example.navigasi_6.R


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FormIsian(
    jenisK:List<String> = listOf("Laki-laki","Perempuan"),
    OnSubmitBtnClick:()-> Unit
){
    Scaffold(modifier = Modifier),
            {
        TopAppBar(
            title = { Text(stringResource(id = R.string.home), color = Color.White) },
            colors = TopAppBarDefaults.mediumTopAppBarColors(
                colorResource(id = R.color.teal_200))
        )
    }

}

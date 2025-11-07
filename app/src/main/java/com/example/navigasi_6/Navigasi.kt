package com.example.navigasi_6

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController


enum class Navigasi {
    FormulirAing,
    Detail
}
@Composable
fun DataApp(
    modifier: Modifier,
    navController: NavHostController = rememberNavController()
){
    Scaffold { isiRuang->
        NavHost(
            navController = navController,
            startDestination = Navigasi.FormulirAing.name,

            modifier = Modifier.padding(isiRuang)){
            composable(route = Navigasi.FormulirAing.name){
                _root_ide_package_.com.example.navigasi_6.View.FormIsian(
                    OnSubmitBtnClick = {
                        navController.navigate(Navigasi.Detail.name)
                    }
                )
            }
            composable(route = Navigasi.Detail.name) {
                _root_ide_package_.com.example.navigasi_6.View.TampilData(
                    onBackBtnClick = {
                        cancelAndBackToFormulir(navController)
                    }
                )
            }

        }
    }
}

private fun cancelAndBackToFormulir(
    navController: NavHostController
) {
    navController.popBackStack(Navigasi.FormulirAing.name, inclusive = false)
}
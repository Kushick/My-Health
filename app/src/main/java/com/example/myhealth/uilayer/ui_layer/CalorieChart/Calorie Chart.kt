package com.example.myhealth.uilayer.ui_layer.CalorieChart

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.myhealth.uilayer.ui_layer.Frontui.Front
import com.example.myhealth.R


@Composable
fun CalorieChart(navController: NavController) {
    Column(
        modifier = Modifier
            .padding(top = 55.dp)
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Front(
                R.drawable.chart_modified,
                stringResource(id = R.string.category6),
                stringResource(id = R.string.Dep6),
                { navController.navigate("Generallist") })
            Front(
                R.drawable.carb,
                stringResource(id = R.string.category7),
                stringResource(id = R.string.Dep7),
                {navController.navigate("Carblist")})
        }

        Spacer(modifier = Modifier.height(50.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Front(
                R.drawable.protein,
                stringResource(id = R.string.category8),
                stringResource(id = R.string.Dep8),
                {navController.navigate("Proteinlist")})
            Front(
                R.drawable.fat,
                stringResource(id = R.string.category9),
                stringResource(id = R.string.Dep9),
                {navController.navigate("Fatlist")})
        }
        Spacer(modifier = Modifier.height(20.dp))
    }
}


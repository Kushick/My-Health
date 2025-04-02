package com.example.myhealth.uilayer.ui_layer.MainScreen

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
fun MainScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .padding(top = 55.dp)
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Front(
                R.drawable.human_icon,
                stringResource(id = R.string.category1),
                stringResource(id = R.string.Dep1),
                {navController.navigate("HealthCalculator")})
            Front(
                R.drawable.diet_icon_removebg,
                stringResource(id = R.string.category2),
                stringResource(id = R.string.Dep2),
                {navController.navigate("dietCalculator")})
        }

        Spacer(modifier = Modifier.height(20.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Front(
                R.drawable.chart_modified,
                stringResource(id = R.string.category3),
                stringResource(id = R.string.Dep3),
                { navController.navigate("CalorieChart") })

            Front(
                R.drawable.diet_info_icon,
                stringResource(id = R.string.category4),
                stringResource(id = R.string.Dep4),
                {navController.navigate("Dietinfo")})
        }
        Spacer(modifier = Modifier.height(20.dp))
        Row(
            modifier = Modifier.width(800.dp),
            horizontalArrangement = Arrangement.Absolute.Center
        ) {
            Front(
                R.drawable.search,
                stringResource(id = R.string.category10),
                stringResource(id = R.string.Dep10),
                {navController.navigate("SearchItem")})
        }
    }
}

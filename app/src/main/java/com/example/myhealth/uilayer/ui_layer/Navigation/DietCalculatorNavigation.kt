package com.example.myhealth.uilayer.ui_layer.Navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.myhealth.uilayer.ui_layer.CalorieChart.CalorieChart
import com.example.myhealth.uilayer.ui_layer.DietCalculator.DietCalculator
import com.example.myhealth.uilayer.ui_layer.DietInformation.DietInfo
import com.example.myhealth.uilayer.ui_layer.DietInformation.Dietinfotext1
import com.example.myhealth.uilayer.ui_layer.DietInformation.Dietinfotext2
import com.example.myhealth.uilayer.ui_layer.DietInformation.Dietinfotext3
import com.example.myhealth.uilayer.ui_layer.Fooditemlists.CarbList
import com.example.myhealth.uilayer.ui_layer.Fooditemlists.FatList
import com.example.myhealth.uilayer.ui_layer.Fooditemlists.GeneralList
import com.example.myhealth.uilayer.ui_layer.Fooditemlists.ProteinList
import com.example.myhealth.uilayer.ui_layer.MainScreen.MainScreen

import com.example.myhealth.uilayer.ui_layer.HealthCalculator.HealthCalculator
import com.example.myhealth.uilayer.ui_layer.Searchitems.SearchItem

@Composable
fun Navscreens() {
    val navController= rememberNavController()
    //calling the start destination
    NavHost(navController = navController, startDestination = "MainScreen") {
        composable("MainScreen") { MainScreen(navController) }
        composable("dietCalculator") { DietCalculator(navController) }
        composable ("CalorieChart"){ CalorieChart(navController) }
        composable ("HealthCalculator"){ HealthCalculator(navController) }
        composable("Generallist"){ GeneralList(navController) }
        composable("Carblist"){ CarbList(navController) }
        composable("Proteinlist"){ ProteinList(navController) }
        composable("Fatlist"){ FatList(navController) }
        composable("Dietinfo"){ DietInfo(navController) }
        composable("BMI-BMR") { Dietinfotext1(navController) }
        composable("Diet") { Dietinfotext2(navController) }
        composable("Lowcarbdiet") { Dietinfotext3(navController) }
        composable("Searchitem") { SearchItem(navController) }
    }
}
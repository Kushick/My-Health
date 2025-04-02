package com.example.myhealth

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.myhealth.ui.theme.MyHealthTheme
import com.example.myhealth.uilayer.ui_layer.DietCalculator.DietCalculator
import com.example.myhealth.uilayer.ui_layer.Navigation.Navscreens


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyHealthTheme {
                //calling the navigation screens
                Navscreens()
            }
        }
    }
}

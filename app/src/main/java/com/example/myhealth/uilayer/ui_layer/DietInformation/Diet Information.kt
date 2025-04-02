package com.example.myhealth.uilayer.ui_layer.DietInformation

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.myhealth.uilayer.ui_layer.Dietinfoui.Dietinfoui
import java.nio.file.WatchEvent

@Composable
fun DietInfo(navController: NavController) {
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(top = 55.dp)) {
        Dietinfoui("১.BMI ও BMR কি?", {navController.navigate("BMI-BMR")})
        Dietinfoui("২.ডায়েট শুরুর আগে কিছু নির্দেশনা",{navController.navigate("Diet")})
        Dietinfoui("৩.লো-কার্ব ডায়েট কি?এবং কেন?",{navController.navigate("Lowcarbdiet")})
        Dietinfoui("Upcomming...",{})

    }
}




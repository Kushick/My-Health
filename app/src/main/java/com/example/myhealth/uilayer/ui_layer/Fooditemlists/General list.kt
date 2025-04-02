package com.example.myhealth.uilayer.ui_layer.Fooditemlists

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun GeneralList(navController: NavController) {
    val foodList = listOf(
        "ভাত (৩৪৬)", "গমের রুটি (৩৪১)", "ছোলা (৩৬০)", "মসুর ডাল (৩৪৩)",
        "গাঁজর (৪৮)", "গোল আলু (৯৭)", "কলমিশাক (২৮)", "পুঁইশাক (২৬)",
        "কুমড়া (৩০)", "বেগুন (২৪)", "ফুলকপি (৩০)", "বাঁধাকপি (২৭)",
        "বরবটি (২৬)", "শিম (৬৬)", "ইলিশ (২৭৩)", "কাতলা মাছ (১১১)", "চিংড়ি (৮৯)",
        "গরুর মাংস (১৪১)", "মুরগির মাংস (১০৯)", "খাসির মাংস (১৯৪)",
        "দুধ (৬৭)", "ডিম (১৭৩)", "রান্নার তেল (৯০০)","Source:The Institute of NUtrition and Food Science(INFS)"
    )
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 55.dp),
        verticalArrangement = Arrangement.Center
    ) {
        Box(
            modifier = Modifier
                .height(80.dp)
                .fillMaxWidth()
                .background(Color.Green),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "প্রতি ১০০ গ্রাম খাবারে\nক্যালরির(kcal)পরিমাণ",
                fontSize = 30.sp,
                color = Color.Black
            )
        }

        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(15.dp)
        ) {
            items(foodList) { foodItem ->
                Text(text=foodItem,
                    fontSize = 28.sp)
            }
        }
    }
}


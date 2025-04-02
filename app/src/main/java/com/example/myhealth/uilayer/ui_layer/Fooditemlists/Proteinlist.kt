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
fun ProteinList(navController: NavController) {
    val foodList = listOf(
        "• ডিম সিদ্ধ ১টি ৭৫(৬০ কুসুম +১৫ সাদা অংশ)",
   " • ডিম ভাজি একটি (৯২-১৭৫)",
    "• ডিম পোচ তেল ছাড়া ১টি (৮০)",
    "•ডিম পোচ তেল দিয়ে ১টি (২০২)",
  " • টিক্কা মুরগি ১০০ গ্রাম (১৪৮)",
  " • মুরগি ভুনা ১০০ গ্রাম/আধা কাপ (১৩২-৩২৩)",
   " •মুরগির কোর্মা ১০০ গ্রাম (২৫০)",
   " •চিকেন ফ্রাই একটি/১২৮ গ্রাম (৩৯০)",
   " •চিকেন কাটলেট ১টি (৩৭৫)",
   " •মাছ কারি ১০০ গ্রাম (৩২৩-৫০০)",
  " • চিংড়ি মাছ কারি ১০০ গ্রাম (২৬১)",
   " •মাছের কাটলেট একটি (২২৮)",
   " •ফিশ ফিঙ্গার তিনটি (১৬২)",
   " •গরু ভুনা এক কাপ (৪৩৪)",
   " •গরুর কোর্মা ১১৫ গ্রাম (১৬৭)",
   " • গরুর শিক কাবাব ১টি শিক (১৬০)",
   " •গরুর সামি কাবাব একটি (২১০)",
   " •গরুর কিমা রান্না করা ২৫০ গ্রাম/এক কাপ (৫৫৫)",
    "•গরুর কাটলেট একটি (৫০০)",
    "•খাসির কোর্মা ১১৪ গ্রাম (১৪৩)",
    "•খাসির রেজালা ১০০ গ্রাম ৩২৩",
    "•খাসির কিমা রান্না ১০০ গ্রাম (১৭৫)",
    "• গরুর কলিজা কারি ১০০ গ্রাম ১৩৫",
        "• মুরগির কলিজা কারি ১০০ গ্রাম ১ কাপ (৩৪০ -৩৫৩)",
    "• নারিকেলের বরফি ১টি (১৯২)",
   " • ক্যারামেল পুডিং ১/২ কাপ (১২০)",
   " • নারিকেলের বরফি ১টি (১৯২)",
   " • ক্যারামেল পুডিং ১/২ কাপ (১২০)",
   " • টক দই আধা কাপ (৬০)"

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
                text = "আমিষ জাতীয় খাদ্যের তালিকা",
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

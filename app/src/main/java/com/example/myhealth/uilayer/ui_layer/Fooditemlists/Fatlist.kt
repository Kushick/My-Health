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
fun FatList(navController: NavController) {
    val foodList = listOf(
        "• কাঠ বাদাম ১ মুঠো (১৬৮)",
    "• পেস্তা বাদাম ১ মুঠো (১৮৮)",
   " • কাজু বাদাম ১ মুঠো (১৭৮)",
   " • চিনা বাদাম ১ মুঠো (১৭০)",
   " • পরোটা তেলে ভাজা ১টি (২৪৩-২৯০)",
    "• আলু পরোটা ১টি (৩০০)",
    "• লুচি একটি (১৪০)",
   " • নান রুটি মাখন সহ ১টি (৪২৪)",
   "• সয়াবিন তেল ১ টেবিল চামচ (১২০)",
    "• জলপাই তেল ১ টেবিল চামচ (১১৯)",
    "• ক্যানোলা তেল ১ টেবিল চামচ (১২৪)",
    "• সরষের তেল ১ টেবিল চামচ (৫৫)",
    "• ঘি ১ টেবিল চামচ (১১২)",
   " • রুমালি রুটি ঘি সহ ১টি (২৪৫)",
    "• তন্দুরি রুটি ঘি সহ ১টি (২৪৭)",
    "• মেয়নেইস ১ টেবিল চামচ (১১০)",
    "• লো ফ্যাট মেয়নেইস ১ টেবিল চামচ (৪৫)",
    "• পিনাট বাটার ১ টেবিল চামচ (৯৪)",
    "• মাখন ১ টেবিল চামচ (১০০)",
    "• মার্জারিন এক টেবিল চামচ ৬৮",
    "• বিফ বার্গার একটি (১১০-৬৬০)",
   " • চিকেন বার্গার একটি (২১০-৪৫০)",
   "• চিকেন স্যান্ডউইচ ১টি (২৭৫)",
   " • পিজ্জা ছোট আকারের (১৬৮০-২৩১০)",
   " • হট ডগ একটি (২৫০)",
   " •  চিকেন রোল একটি (২৩৫)",
   " • চিকেন শর্মা একটি (৪৭৫)",
       "•  ফুচকা একটি (৫০)",
   " •  চটপটি ১/২ কাপ (৫০০)",
    "•  পাপড় তেলে ভাজা একটি (৪৩)",
    "•  পাপড় গ্রিল্ড/ মাইক্রোওভেন একটি (৩০)",
   " •  নিমকি একটি (১৬৩)",
    "•  ক্রিম বিস্কিট একটি (৭০-১৪০)",
   " •  এনার্জি/গ্লুকোস বিস্কিট একটি (২৩-৩৩)",
   "•  পেয়াজু/ পাকোড়া ১টি (৬০-২১১)",
   " •  ডালপুরি একটি (১২৪)",
   " •  সিঙ্গারা একটি (২০০)",
   " •  সমসা ১টি (১০৩-২৫৬)",
   "•  আলুর চপ ১টি (১৫০-২৭৫)",
   " •  রুমালি রুটি ঘি সহ ১টি (২৪৫)",
   " •  তন্দুরি রুটি ঘি সহ ১টি (২৪৭)",
   " •  চিজ কেক ১ টুকরা (১৩৮০-১৬৭০)",
   " •  ঢাকাই পনির ২ টেবিল চামচ (৪০)",
   " •  মজারেলা পনির ১ কাপ (৩৩৬)"


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
                text = "ফ্যাট জাতীয় খাদ্যের তালিকা",
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

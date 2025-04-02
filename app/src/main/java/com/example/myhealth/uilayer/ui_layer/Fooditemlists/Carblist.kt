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
fun CarbList(navController: NavController) {
    val foodList = listOf(
        "•চিনি এক চা চামচ (১৬)",
    "• মধু এক চা চামচ (২২)",
    "• গুড় এক চা চামচ (২৫)",
    "•সাদা চালের ভাত (১ কাপ ২০০-২৪২)",
    "• লাল চালের ভাত ১ কাপ (২১৮)",
    "• সাদা পাউরুটি ১ স্লাইস (৬৭-৯৬)",
    "• লাল পাউরুটি ১ স্লাইস (৬০-৮৯)",
    "• বান রুটি ১টি (১৫০)",
    "• সাদা আটার রুটি ১টি (৭২)",
    "• লাল আটার রুটি ১টি (৬০)",
    "•ফালুদা এক গ্লাস (৩০০)",
    "• ফলের কাস্টার্ড ১ কাপ (১৭২-২৩২)",
    "• ময়দা এক কাপ (৪৫৫)",
    "• সাদা আটা এক কাপ (৪০০)",
    "• লাল আটা এক কাপ (৩৫৬)",
    "• চালের আটা এক কাপ (৫৭৮)",
    "• নুডুলস সিদ্ধ এক কাপ (২২০)",
    "• নান রুটি ১টি (৩১২)",
    "• চালের রুটি ১টি (১০৫)",
    "•রুমালি রুটি ১টি (২০০)",
    "•রুমালি রুটি ঘি সহ ১টি (২৪৫)",
    "• তন্দুরি রুটি ১টি (১০২-১২০)",
    "• তন্দুরি রুটি ঘি সহ ১টি (২৪৭)",
    "• মুগ ডাল খিচুড়ি ৩/৪ কাপ (১৭৬-২১৫)",
    "• পোলাউ এক কাপ (২৫৮)",
    "• চিকেন বিরিয়ানি এক কাপ (৪১৮)",
    "• সবজি বিরিয়ানি এক কাপ (২২০)",
        "•খাসির বিরিয়ানি এক প্লেট (৪৭০)",
    "• ফ্রাইড রাইস এক কাপ (১২০-৩৯০)",
    "• চাওমেই এক প্লেট (১৮২০-২৪৩০)",
    "•দুধ এক কাপ (১৪৬)",
    "• লো ফ্যাট দুধ ১ কাপ/২৪০ মিলি (৯০)",
    "•কনডেন্সড মিল্ক ১/২ কাপ (৪৯০)",
    "•সয়া দুধ এক কাপ (৯০)",
        "• মসুর ডাল রান্না করা ১ কাপ (২২৬)",
    "•মুগ ডাল রান্না করা এক কাপ (১৫০)",
    "•বুটের ডাল রান্না করা ১ কাপ (১০৭)",
    "•মিক্সড সবজি সিদ্ধ ১ কাপ (৫০)",
    "•মিক্সড সবজি ভাজি ১ কাপ (১১০)",
    "•মিক্সড সবজির কোর্মা ১/২ কাপ (১৭৩)",
    "•মিক্সড সবজি (লাবড়া/কারী) ২০০ গ্রাম (১৯০)",
    "•সবজির কোফতা কারি ১০০ গ্রাম (১৪৭)",
    "•মিক্সড সবজি স্টার ফ্রাই ১ কাপ(২০৭)",
    "•লাল শাক ভাজি ১/২ কাপ (৫০)",
    "• পালং শাক সিদ্ধ ১ কাপ (৪১)",
    "•বেগুন ভর্তা ১০০ গ্রাম (৭০)",
    "•আলু ভর্তা ১০০ গ্রাম (১৫০)",
    "•ঢেরস ভাজি ১ কাপ (১৩০)",
    "•আলুর দম ১০০ গ্রাম (১০৫)",
    "•বেগুন ভাজি এক পিস (১১৪)",
   "•আলুর চিপস এক মুঠো (১৬০)",
    "•ফ্রেঞ্চ ফ্রাই ১০০ গ্রাম (২৯৪)",
    "• টোস্ট বিস্কিট ১টি মাঝারি আকারের (৮৮)",
        "• Digestive বিস্কিট ১টি (৭৪)",
    "• মেরী বিস্কিট ১টি (১৬-২৮)",
    "• নোনতা বিস্কিট একটি (৪০)",
    "• চানাচুর ২০ গ্রাম (১১০)",
    "• টমেটো সস ১ টেবিল চামচ (২৫)",
    "• জেলি ১ টেবিল চামচ (১১০)",
    "• জ্যাম ১ টেবিল চামচ (১০০)",
    "• হরলিক্স ১ টেবিল চামচ (২০)",
    "• চকলেট ওভালটিন ১ টেবিল চামচ (২০)",
    "• ওভালটিন এক টেবিল চামচ (২০)",
   "•  চা ১ চা চামচ চিনি ও দুধ সহ ১ কাপ (২৬)",
    "• চা চিনি ও দুধ ছাড়া এক কাপ (২)",
    "• কফি ১ চা চামচ চিনি ও দুধ সহ ১ কাপ (৩৭)",
    "• কফি চিনি ও দুধ ছাড়া ১ কাপ (২)",
    "• প্লেইন কেক এক টুকরা (২১৮)",
    "• ক্যাপসিকাম ১ টি (১৫)",
    "• ফ্রুট কেক ১ টুকরা (৩২০-৩৬৬)",
   " • চকলেট ১ এক টুকরা (২৩৫)",
    "• পেস্ট্রি ১ টুকরা (৩৩০-৪০০)",
    "•আইস ক্রিম ১ কাপ (২৬৭-৭২০)",
    "•কোমল পানীয় এক বোতল/ ক্যান (১৫০)",
    "•আপেলের জুস (চিনি ছাড়া) ১ গ্লাস (১১৭)",
    "•আঙ্গুরের জুস (চিনি ছাড়া) ১ গ্লাস (১৫৪)",
    "•কমলার জুস (চিনি ছাড়া) ১ গ্লাস (৯৫)",
    "• পেপের জুস (চিনি ছাড়া) ১ গ্লাস (১৪১)",
    "•মিক্সড সবজি ও ফলের জুস ১ গ্লাস (৭২)",
    "•লাচ্ছি (চিনি সহ) ১ গ্লাস (১০০-১৫০)", "• লাচ্ছি (চিনি সহ) ১ গ্লাস (১০০-১৫০)",
   " • চকলেট মিল্ক সেক ১ গ্লাস (৯০০)",
    "• ডাবের পানি এক গ্লাস (৫০)",
    "• বোরহানি এক গ্লাস (১০০)",
    "• লেবুর রস ১ টেবিল চামচ (৫)",
    "লাড্ডু একটি (২০০-২৫০)",
   " • রসগোল্লা একটি (১৫০)",
   " • চমচম একটি (১৭৫)",
   " • লালমোহন একটি (২৮৮)",
   " • ছানার সন্দেশ একটি (১২০)",
    "বালুসাই একটি (২৫০)",
    "• রসমালাই ৪ টি (২৫০)",
   " • জিলাপি বড় একটি (২০০)",
   " গাজরের হালুয়া চিনি সহ ১ বাটি (২৬০-৪০০)",
   " সুজির হালুয়া ৩০ গ্রাম/১ পিস ১০০",
   " বুটের হালুয়া/ বরফি এক পিস (১৫০-২০০)",
   " পায়েশ ১০০ গ্রাম(১৪১)",
   " • জর্দা ১/২ কাপ (২০০-৪০০)",
   " • পাটিসাপটা একটি (৩০০)",
    "• ভাপা পিঠা একটি (৬০০)",
    "•তেলের পিঠা (মালপোয়া) ১টি (৩২৫)",
    "• মিষ্টি দই আধা কাপ (২০০)",
    "• কিশমিশ ১/২ কাপ (২১০)",
    "• খেজুর একটি (২৩)",
    "• আপেল একটি (৯০)",
    "• সাগর কলা একটি (১১০)",
    "•পেয়ারা একটি (৫০)",
    "•আম এক কাপ (১০৭)",
        "• আঙ্গুর এক কাপ (৬২)",
    "• কালো জাম ১টি (৩-৪)",
   " • আনারস এক কাপ (৭৮)",
   " • নাশপাতি একটি (৮১)",
   " • কাঠাল এক কাপ (১৫৫)",
   " • তরমুজ এক কাপ (৪৬)",
    "• পেঁপে এক কাপ (৫৫)",
  "  • লিচু এক কাপ (১২৫)",
   " • শশা ১/২ কাপ (৪)",
    "• গাজর ১ কাপ (৫২)",
    "• টমেটো ১ টি (৩০)",
   " • লেটুস ৩ টি (৫)"
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
                text = "শর্করা জাতীয় খাদ্যের তালিকা",
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


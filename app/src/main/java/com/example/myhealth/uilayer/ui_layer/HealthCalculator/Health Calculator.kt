package com.example.myhealth.uilayer.ui_layer.HealthCalculator

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.RadioButton
import androidx.compose.material3.RadioButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.Color.Companion.Blue
import androidx.compose.ui.graphics.Color.Companion.Gray
import androidx.compose.ui.graphics.Color.Companion.Transparent
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun HealthCalculator(navController: NavController) {
    var isMaleSelected by remember { mutableStateOf(false) }
    var isFemaleSelected by remember { mutableStateOf(false) }
    var age by remember { mutableStateOf("") }
    var height_feet by remember { mutableStateOf("") }
    var height_inch by remember { mutableStateOf("") }
    var weight by remember { mutableStateOf("") }
    var bmi by remember { mutableStateOf<Double?>(null) }
    var bmr by remember { mutableStateOf<Double?>(null) }
    val context = LocalContext.current

    Column(modifier = Modifier.padding(top = 55.dp, start = 20.dp)) {

        Row {
            Text(
                text = "লিঙ্গ ",
                fontSize = 35.sp,
                color = Blue,
                fontWeight = FontWeight.Bold
            )

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.CenterVertically
            ) {
                RadioButton(
                    selected = isMaleSelected,
                    onClick = {
                        isMaleSelected = true
                        isFemaleSelected = false

                    },
                    colors = RadioButtonDefaults.colors(selectedColor = Black)
                )
                Text(
                    text = "পুরুষ",
                    fontSize = 25.sp
                )

                RadioButton(
                    selected = isFemaleSelected,
                    onClick = {
                        isFemaleSelected = true
                        isMaleSelected = false
                    },
                    colors = RadioButtonDefaults.colors(selectedColor = Black)
                )
                Text(
                    text = "মহিলা",
                    fontSize = 25.sp
                )
            }
        }

        Spacer(modifier = Modifier.height(15.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "বয়স",
                fontSize = 35.sp,
                color = Blue,
                fontWeight = FontWeight.Bold
            )
            TextField(
                value = age,
                onValueChange = { age = it },
                colors = TextFieldDefaults.colors(
                    focusedContainerColor = Transparent,
                    unfocusedContainerColor = Transparent,
                    focusedTextColor = Black,
                    unfocusedTextColor = Black
                ),
                placeholder = { Text(text = "আপনার বয়স দিন") },
                modifier = Modifier.width(120.dp),
                keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Number)
            )
        }

        Spacer(modifier = Modifier.height(20.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "উচ্চতা",
                fontSize = 35.sp,
                color = Blue,
                fontWeight = FontWeight.Bold
            )
            TextField(
                value = height_feet,
                onValueChange = { height_feet = it },
                colors = TextFieldDefaults.colors(
                    focusedContainerColor = Transparent,
                    unfocusedContainerColor = Transparent,
                    focusedTextColor = Black,
                    unfocusedTextColor = Black
                ),
                placeholder = { Text(text = "ফুট") },
                modifier = Modifier.width(100.dp),
                keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Number)
            )

            Spacer(modifier = Modifier.width(15.dp))

            TextField(
                value = height_inch,
                onValueChange = { height_inch = it },
                colors = TextFieldDefaults.colors(
                    focusedContainerColor = Transparent,
                    unfocusedContainerColor = Transparent,
                    focusedTextColor = Black,
                    unfocusedTextColor = Black
                ),
                placeholder = { Text(text = "ইঞ্চি") },
                modifier = Modifier.width(100.dp),
                keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Number)
            )
        }

        Spacer(modifier = Modifier.height(20.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "ওজন",
                fontSize = 35.sp,
                color = Blue,
                fontWeight = FontWeight.Bold
            )
            TextField(
                value = weight,
                onValueChange = { weight = it },
                colors = TextFieldDefaults.colors(
                    focusedContainerColor = Transparent,
                    unfocusedContainerColor = Transparent,
                    focusedTextColor = Black,
                    unfocusedTextColor = Black
                ),
                placeholder = { Text(text = "কেজি") },
                modifier = Modifier.width(120.dp),
                keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Number)
            )
        }

        Spacer(modifier = Modifier.height(30.dp))
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
            Button(
                onClick = {
                    val intAge = age.toInt()
                    val intHeightFeet = height_feet.toInt()
                    val doubleHeightInch = height_inch.toDouble()
                    val doubleWeight = weight.toDouble()
//
//                    if (intAge == null || intHeightFeet == null || doubleHeightInch == null || doubleWeight == null){
//                        Toast.makeText(context,"সঠিক তথ্য দিন",Toast.LENGTH_SHORT).show()
//                    }
                    bmi = calculateBMI(
                        intHeightFeet,
                        doubleHeightInch,
                        doubleWeight
                    ).toDouble()

                    bmr = calculateBMR(
                        isMaleSelected,
                        intAge,
                        intHeightFeet,
                        doubleHeightInch,
                        doubleWeight
                    ).toDouble()

                },
                colors = ButtonDefaults.buttonColors()
                    .copy(containerColor = Blue, contentColor = White),
                shape = RectangleShape,
                modifier = Modifier.clip(RoundedCornerShape(10.dp))
            ) {
                Text(text = "স্বাস্থ্য পর্যবেক্ষণ", fontSize = 25.sp)
            }
        }

        Card(
            modifier = Modifier
                .padding(10.dp)
                .fillMaxWidth()
                .height(80.dp),
            colors = CardDefaults.cardColors(containerColor = Blue, contentColor = White)
        ) {
            Text("আপনার বিএমআই: ${bmi?.let { String.format("%.2f", it) } ?: ""}",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold)
            bmi?.let { bmi ->
                val status = when {
                    bmi < 20.00 -> "ওজন কম"
                    bmi in 20.00..25.0 -> "স্বাভাবিক"
                    bmi in 25.0..30.0 -> "অতিরিক্ত ওজন"
                    bmi in 30.0..40.0 -> "মেদবহুল"
                    else -> "অতিরিক্ত মেদবহুল"
                }
                Text(text = status, fontSize = 25.sp, color = White)
            }
        }

        Spacer(modifier = Modifier.height(20.dp))

        Card(
            modifier = Modifier
                .padding(10.dp)
                .fillMaxWidth()
                .height(80.dp),
            colors = CardDefaults.cardColors(containerColor = Blue, contentColor = White)
        ) {
            Text(
                "আপনার বিএমআর:${bmr?.let { String.format("%.2f", it) } ?: ""}",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )
            Text(text = "", fontSize = 25.sp, color = White)
        }
    }
}


fun calculateBMI(height_feet: Int, height_inch: Double, tr_weight: Double): Double {
    var total_height = (height_feet * 0.304) + (height_inch * 0.0254)
    return if (total_height > 0) tr_weight / (total_height * total_height) else 0.0
}

fun calculateBMR(
    isMaleSelected: Boolean,
    age: Int,
    height_feet: Int,
    height_inch: Double,
    tr_weight: Double
): Double {
    var total_height = (height_feet * 0.304) + (height_inch * 0.0254)
    return if (isMaleSelected) {
        88.36 + (13.4 * tr_weight) + (4.8 * total_height) - (5.7 * age)
    } else {
        447.6 + (9.2 * tr_weight) + (3.1 * total_height) - (4.3 * age)
    }
}


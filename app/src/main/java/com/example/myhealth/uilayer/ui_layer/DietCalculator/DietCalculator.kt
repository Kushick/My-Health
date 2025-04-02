package com.example.myhealth.uilayer.ui_layer.DietCalculator

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Slider
import androidx.compose.material3.SliderDefaults
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
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.Color.Companion.Blue
import androidx.compose.ui.graphics.Color.Companion.Gray
import androidx.compose.ui.graphics.Color.Companion.Transparent
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun DietCalculator(navController: NavHostController) {
    var sliderpos1 by remember { mutableStateOf(0f) }
    var sliderpos2 by remember { mutableStateOf(0f) }
    var sliderpos3 by remember { mutableStateOf(0f) }
    var calval by remember { mutableStateOf("") }
    val calvalFloat = calval.toFloatOrNull() ?: 0f

    var carb by remember { mutableStateOf(0f) }
    var protein by remember { mutableStateOf(0f) }
    var fat by remember { mutableStateOf(0f) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 55.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "আপনার ডায়েট বেছে নিন",
            fontSize = 30.sp,
            color = Blue,
            fontWeight = FontWeight.Bold
        )

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Button(
                onClick = {
                    sliderpos1 = 60f
                    sliderpos2 = 25f
                    sliderpos3 = 15f
                },
                shape = RectangleShape,
                colors = ButtonDefaults.buttonColors()
                    .copy(containerColor = Blue, contentColor = White)
            ) {
                Text(
                    text = "হাই কার্ব\n৬০/২৫/১৫",
                    color = White
                )
            }

            Button(
                onClick = {
                    sliderpos1 = 50f
                    sliderpos2 = 30f
                    sliderpos3 = 20f
                },
                shape = RectangleShape,
                colors = ButtonDefaults.buttonColors()
                    .copy(containerColor = Blue, contentColor = White)
            ) {
                Text(
                    text = "মোডারেট কার্ব\n৫০/৩০/২০",
                    color = White
                )
            }

            Button(
                onClick = {
                    sliderpos1 = 20f
                    sliderpos2 = 40f
                    sliderpos3 = 40f
                },
                shape = RectangleShape,
                colors = ButtonDefaults.buttonColors()
                    .copy(containerColor = Blue, contentColor = White)
            ) {
                Text(
                    text = "লো কার্ব\n২০/৪০/৪০",
                    color = White
                )
            }
        }

        Text(
            text = "অথবা নিজেই রেশিও ঠিক করুন",
            fontSize = 25.sp,
            color = Blue,
            fontWeight = FontWeight.Bold
        )
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(10.dp),
            horizontalAlignment = Alignment.Start
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "কার্বোহাইড্রেট",
                    fontSize = 28.sp,
                    color = Black,
                    fontWeight = FontWeight.Bold
                )
                Spacer(modifier = Modifier.width(20.dp))
                Text(
                    text = "${sliderpos1.toInt()}%",
                    fontSize = 35.sp,
                    color = Black,

                    )
            }

            Slider(
                value = sliderpos1,
                onValueChange = { sliderpos1 = it },
                valueRange = 0f..100f,
                colors = SliderDefaults.colors().copy(
                    activeTrackColor = Blue,
                    inactiveTrackColor = Gray,
                    thumbColor = Transparent,
                    disabledThumbColor = Transparent
                ),
            )

            Row {
                Text(
                    text = "প্রোটিন",
                    fontSize = 28.sp,
                    color = Black,
                    fontWeight = FontWeight.Bold
                )
                Spacer(modifier = Modifier.width(20.dp))
                Text(
                    text = "${sliderpos2.toInt()}%",
                    fontSize = 35.sp,
                    color = Black,

                    )
            }
            Slider(
                value = sliderpos2,
                onValueChange = { sliderpos2 = it },
                valueRange = 0f..100f,
                colors = SliderDefaults.colors().copy(
                    activeTrackColor = Blue,
                    inactiveTrackColor = Gray,
                    thumbColor = Transparent,
                    disabledThumbColor = Transparent
                ),
            )

            Row {
                Text(
                    text = "ফ্যাট",
                    fontSize = 28.sp,
                    color = Black,
                    fontWeight = FontWeight.Bold
                )
                Spacer(modifier = Modifier.width(20.dp))
                Text(
                    text = "${sliderpos3.toInt()}%",
                    fontSize = 35.sp,
                    color = Black,

                    )
            }

            Slider(
                value = sliderpos3,
                onValueChange = { sliderpos3 = it },
                valueRange = 0f..100f,
                colors = SliderDefaults.colors().copy(
                    activeTrackColor = Blue,
                    inactiveTrackColor = Gray,
                    thumbColor = Transparent,
                    disabledThumbColor = Transparent
                ),
            )

            Spacer(modifier = Modifier.height(5.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "আপনার প্রতিদিনের ক্যালরি",
                    fontSize = 22.sp
                )
                Spacer(modifier = Modifier.width(30.dp))
                Button(
                    onClick = {
                        val result = CalculateCal(sliderpos1, sliderpos2, sliderpos3, calvalFloat)

                        carb = result.first
                        protein = result.second
                        fat = result.third
                    },
                    colors = ButtonDefaults.buttonColors()
                        .copy(containerColor = Blue, contentColor = White)
                ) {
                    Text(
                        "দেখুন",
                        fontSize = 20.sp,
                    )
                }
            }

            TextField(
                value = calval,
                onValueChange = { calval = it },
                placeholder = { Text("প্রতিদিনের ক্যালরি") },
                keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Number),
                colors = TextFieldDefaults.colors().copy(
                    focusedTextColor = Black,
                    focusedContainerColor = Transparent,
                    unfocusedContainerColor = Transparent,
                    focusedIndicatorColor = Blue,
                    unfocusedIndicatorColor = Gray
                ),
                modifier = Modifier.width(250.dp)
            )

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
                    .background(White)
            ) {
                Column {
                    Text(
                        "কার্বোহাইড্রেট প্রয়োজন: ${String.format("%.2f", carb)} গ্রাম",
                        fontSize = 20.sp,
                        color=Black
                    )
                    Text(
                        "প্রোটিন প্রয়োজন: ${String.format("%.2f", protein)} গ্রাম",
                        fontSize = 20.sp,
                        color=Black
                    )
                    Text("ফ্যাট প্রয়োজন: ${String.format("%.2f", fat)} গ্রাম",
                        fontSize = 20.sp,
                        color=Black
                    )
                }
            }
        }
    }
}


fun CalculateCal(
    sliderpos1: Float,
    sliderpos2: Float,
    sliderpos3: Float,
    calvalfloat: Float
): Triple<Float, Float, Float> {
    val cb = (sliderpos1 / 100) * calvalfloat
    val pt = (sliderpos2 / 100) * calvalfloat
    val ft = (sliderpos3 / 100) * calvalfloat

    val carb = cb / 4
    val protein = pt / 4
    val fat = ft / 9

    return Triple(carb, protein, fat)

}

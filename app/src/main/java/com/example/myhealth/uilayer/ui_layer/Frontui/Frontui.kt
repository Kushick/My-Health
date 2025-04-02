package com.example.myhealth.uilayer.ui_layer.Frontui

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.LightGray
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myhealth.R

@Composable
fun Front(Img: Int, Title: String,Desp:String, onclick: () -> Unit) {

    Card(
        modifier = Modifier
            .wrapContentHeight()
            .width(180.dp)
            .clickable { onclick() },
        elevation = CardDefaults.cardElevation(20.dp),
        colors = CardDefaults.cardColors(containerColor = LightGray)
    ) {
        Column(
            modifier = Modifier
                .height(250.dp)
                .padding(bottom = 10.dp, start = 10.dp, end = 10.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(painter = painterResource(Img), contentDescription = "")
            Spacer(modifier = Modifier.weight(1f))
            Text(
                text = Title,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )
            Divider(color=Color.Black,
                thickness=2.dp,
                modifier=Modifier.wrapContentWidth()
            )
            Text(
                text = Desp,
                fontSize = 15.sp,
            )
        }
    }

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    Front(R.drawable.human_icon, "Health Calculator", "Hello there",{})
}
package com.example.myhealth.uilayer.ui_layer.Dietinfoui

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun Dietinfoui(info: String,onClick:()-> Unit) {
    Column{
        Button(onClick = onClick,
            modifier=Modifier.fillMaxWidth(),
            shape = RectangleShape,
            colors = ButtonDefaults.buttonColors().copy(containerColor = White, contentColor = Black)
        ){
            Text(text = info,
                modifier = Modifier.padding(10.dp),
                color = Black,
                fontSize = 20.sp)
        }

        Divider(modifier = Modifier.fillMaxWidth())
    }
}

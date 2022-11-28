package com.example.bookingappjc

import android.graphics.Color.alpha
import android.graphics.Color.parseColor
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlin.math.round

@Composable
fun Home() {
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.bg2), contentDescription = "background",
            modifier = Modifier.matchParentSize(),
            contentScale = ContentScale.FillBounds
        )
        Column(
            modifier = Modifier.matchParentSize(),
        ) {
            Box(
                modifier = Modifier.background(
                    Color.Transparent
            )
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp).padding(top = 7.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                ) {
                    Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "Back", modifier = Modifier.size(40.dp))
                    Icon(imageVector = Icons.Default.Menu, contentDescription = "Menu", modifier = Modifier.size(40.dp))
                }
            }
            Text(
                text = "Pick Destination",
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(10.dp),
                fontSize = 30.sp
            )
            labelInput(label = "Current location")
            labelInput(label = "Destination")
            labelInput(label = "Type")
            Row(
                Modifier
                    .fillMaxWidth()
                    .weight(1f),
                horizontalArrangement = Arrangement.End,
                verticalAlignment = Alignment.Bottom
            ) {
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier.padding(10.dp),
                    colors = ButtonDefaults.buttonColors(backgroundColor = "#FFFFEB".color),
                    shape = RoundedCornerShape(10.dp)
                ) {
                    Text(text = "NEXT")
                }
            }
        }
    }
}

@Composable
fun labelInput(label: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(text = label, fontSize = 15.sp)
        var text by remember { mutableStateOf("") }
        TextField(
            value = text,
            onValueChange = { newText ->
                text = newText
            },
            modifier = Modifier
                .width(220.dp)
                .height(30.dp)
                .border(width = 1.dp, color = "#707070".color),
            colors = TextFieldDefaults.textFieldColors(backgroundColor = Color.White)
        )
    }
}

val String.color
    get() = Color(parseColor(this))

@Preview(showBackground = true)
@Composable
fun homePreview() {
    Home()
}
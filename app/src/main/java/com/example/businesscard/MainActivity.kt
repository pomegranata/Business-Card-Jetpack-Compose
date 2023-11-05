package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(7,48,66)
                ) {
                    BusinessCard()
                }
            }
        }
    }
}

@Composable
fun IntroText() {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
    ) {
        Image(
            painter = painterResource(id = R.drawable.android_logo),
            contentDescription = stringResource(R.string.image_description),
            modifier = Modifier
                .height(150.dp)
                .width(150.dp)
        )
        Text(
            text = stringResource(R.string.name),
            fontFamily = FontFamily.SansSerif,
            fontWeight = FontWeight.Light,
            color = Color.White,
            fontSize = 35.sp,
            modifier = Modifier
                .padding(bottom = 10.dp)
        )
        Text(
            text = stringResource(R.string.title),
            color = Color(0xFF3ddc84),
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp
        )
    }
}

@Composable
fun ContactInfo() {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 670.dp)
            .padding(bottom = 30.dp)
    ) {
        Row (
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 95.dp)
                .padding(bottom = 10.dp)
        ) {
            Icon(
                imageVector = Icons.Default.Person,
                contentDescription = "Instagram Profile",
                tint = Color(0xFF3ddc84)
            )
            Spacer(
                modifier = Modifier
                    .width(20.dp)
            )
            Text(
                text = stringResource(R.string.instagram_acc),
                fontFamily = FontFamily.SansSerif,
                color = Color.White
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 95.dp)
                .padding(bottom = 10.dp)
        ) {
            Icon(
                imageVector = Icons.Default.Email,
                contentDescription = "Email",
                tint = Color(0xFF3ddc84)
            )
            Spacer(
                modifier = Modifier
                    .width(20.dp)
            )
            Text(
                text = "imeldamare346@gmail.com",
                fontFamily = FontFamily.SansSerif,
                color = Color.White
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 95.dp)
        ) {
            Icon(
                imageVector = Icons.Default.Info,
                contentDescription = "GitHub Profile",
                tint = Color(0xFF3ddc84)
            )
            Spacer(
                modifier = Modifier
                    .width(20.dp)
            )
            Text(
                text = stringResource(R.string.github_acc),
                fontFamily = FontFamily.SansSerif,
                color = Color.White
            )
        }
    }
}

@Composable
fun BusinessCard() {
    IntroText()
    ContactInfo()
}

@Preview(showBackground = false)
@Composable
fun BusinessCardPreview() {
    BusinessCardTheme {
        BusinessCard()
    }
}

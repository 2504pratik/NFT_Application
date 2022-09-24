package com.example.nftapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.nftapplication.ui.theme.NFTApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NFTApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    HomePageWithImage(
                        s1 = "Welcome to NFT Marketplace",
                        s2 = "Explore and Mint NFTs",
                        s3 = "You can buy and sell the NFTs."
                    )
                }
            }
        }
    }
}

@Composable
fun HomePageWithImage(s1: String, s2: String, s3: String) {
    val image = painterResource(id = R.drawable.javier_miranda_mrwocgkfvdg_unsplash_1)
    Image(
        painter = image,
        contentDescription = null,
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        contentScale = ContentScale.Crop
    )
    HomePageWithText(s1 = s1, s2 = s2, s3 = s3)
}

@Composable
fun HomePageWithText(s1: String, s2: String, s3: String) {
    Column() {
        Text(text = s1,
        color = Color.White,
            fontSize = 36.sp
            )
        Text(text = s2)
        Text(text = s3)
        Button(onClick = { /*TODO*/ }, modifier = Modifier.padding(start = 30.dp)) {
            Text(text = "Get started now")
        }
    }

}

@Preview(showBackground = true)
@Composable
fun HomePageWithText() {
    NFTApplicationTheme {
        HomePageWithImage(
            s1 = "Welcome to NFT Marketplace",
            s2 = "Explore and Mint NFTs",
            s3 = "You can buy and sell the NFTs."
        )
    }
}
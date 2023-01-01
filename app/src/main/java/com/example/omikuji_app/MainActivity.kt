package com.example.omikuji_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.omikuji_app.ui.theme.Omikuji_appTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Omikuji_appTheme {
                // A surface container using the 'background' color from the theme
                Column(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.SpaceEvenly,
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    showLucky()
                    machibito()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Omikuji_appTheme {
        Greeting("Android")
    }
}

// 運勢
@Composable
fun showLucky() {
    val lucky = listOf<String>("大吉","吉", "中吉", "小吉", "末吉", "凶")
    val luckySet = lucky.shuffled().first()
    Text(text = "運勢：${luckySet}", fontSize = 30.sp)
}


/**
 * 願望
 */


/**
 * 失物
 */

/**
 * 争事
 */
@Composable
fun battle() {
    val battle = listOf<String>("めちゃくちゃ来ます", "ドン引きするくらい来る", "誰も来ない", "後ろにいます", "あなたの隣にいる")
    val randomPeople = people.shuffled().first()
    Text(text = "待人：${randomPeople}", fontSize = 20.sp)
}

/**
 * 商売
 */

/**
 * 縁談
 */

/**
 * 恋愛
 */

/**
 * 旅行
 */

/**
 * 待人
 */
@Composable
fun machibito() {
    val people = listOf<String>("めちゃくちゃ来ます", "ドン引きするくらい来る", "誰も来ない", "後ろにいます", "あなたの隣にいる")
    val randomPeople = people.shuffled().first()
    Text(text = "待人：${randomPeople}", fontSize = 20.sp)
}



/**
 * 転居
 */
@Composable
fun machibito() {
    val people = listOf<String>("めちゃくちゃ来ます", "ドン引きするくらい来る", "誰も来ない", "後ろにいます", "あなたの隣にいる")
    val randomPeople = people.shuffled().first()
    Text(text = "待人：${randomPeople}", fontSize = 20.sp)
}
@Composable
fun machibito() {
    val people = listOf<String>("めちゃくちゃ来ます", "ドン引きするくらい来る", "誰も来ない", "後ろにいます", "あなたの隣にいる")
    val randomPeople = people.shuffled().first()
    Text(text = "待人：${randomPeople}", fontSize = 20.sp)
}
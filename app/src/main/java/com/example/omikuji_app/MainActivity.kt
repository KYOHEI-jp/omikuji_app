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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.omikuji_app.ui.theme.Omikuji_appTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Omikuji_appTheme {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Top,
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    showLucky()
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        verticalArrangement = Arrangement.SpaceEvenly,
                        horizontalAlignment = Alignment.CenterHorizontally,
                    ) {
                        machibito()
                        battle()
                        travel()
                    }

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
    val lucky = listOf<String>("大吉", "吉", "中吉", "小吉", "末吉", "凶")
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
    val battle = listOf<String>("すぐ喧嘩になる", "世界大戦の様相", "10人vs1人", "後ろにいます", "あなたの隣にいる")
    val randomBattle = battle.shuffled().first()
    Text(text = "争事：${randomBattle}", fontSize = 20.sp)
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
@Composable
fun travel() {
    val people = listOf<String>("めちゃくちゃ来ます", "ドン引きするくらい来る", "誰も来ない", "後ろにいます", "あなたの隣にいる")
    val randomPeople = people.shuffled().first()
    Text(text = "旅行：${randomPeople}", fontSize = 20.sp)
}

/**
 * 待人
 */
@Composable
fun machibito() {
    val people =
        listOf<String>("めちゃくちゃ来る", "大勢で押し寄せる", "ドン引きするくらい来る", "誰も来ない", "後ろにいます", "あなたの隣にいる")
    val randomPeople = people.shuffled().first()
    Text(text = "待人：${randomPeople}", fontSize = 20.sp)
}


/**
 * 転居
 */
@Composable
fun move() {
    val people = listOf<String>("めちゃくちゃ来ます", "ドン引きするくらい来る", "誰も来ない", "後ろにいます", "あなたの隣にいる")
    val randomPeople = people.shuffled().first()
    Text(text = "転居：${randomPeople}", fontSize = 20.sp)
}
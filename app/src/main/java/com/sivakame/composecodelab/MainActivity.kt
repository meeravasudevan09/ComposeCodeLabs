package com.sivakame.composecodelab

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Divider
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sivakame.composecodelab.ui.theme.ComposeCodeLabTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApp {
                MyScreenContent()
            }
        }
    }
}

@Composable
fun MyScreenContent(names: List<String> = listOf("one", "two", "three")) {
    Column {
        for (name in names) {
            Greeting(name = name)
            Divider(color = Color.Black)
        }
    }
}

@Composable
fun MyApp(content: @Composable () -> Unit) {
    ComposeCodeLabTheme {
        // A surface container using the 'background' color from the theme
        Surface(color = Color.Cyan, border = BorderStroke(2.dp, Color.Red)) {
            content()
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Countdown $name!", modifier = Modifier.padding(12.dp))
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyApp {
        MyScreenContent()
    }
}

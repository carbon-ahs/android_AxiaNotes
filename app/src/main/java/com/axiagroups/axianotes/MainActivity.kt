package com.axiagroups.axianotes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.axiagroups.axianotes.ui.theme.AxiaNotesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AxiaNotesApp(
                name = "Android",
                modifier = Modifier
            )
        }
    }
}


@Composable
fun AxiaNotesApp(name: String, modifier: Modifier = Modifier) {
    AxiaNotesTheme {
        Scaffold(modifier = modifier.fillMaxSize()) { innerPadding ->
            Box(modifier = Modifier.padding(innerPadding)) {
                Text(text = "fkjkjj")
            }
        }
    }
}

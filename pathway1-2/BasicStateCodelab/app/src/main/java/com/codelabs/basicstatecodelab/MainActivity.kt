package com.codelabs.basicstatecodelab

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import com.codelabs.basicstatecodelab.ui.theme.BasicStateCodelabTheme

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    Log.e("onCreate","onCreate")

    setContent {
      Log.e("setContent","setContent")

      BasicStateCodelabTheme {
        Log.e("BasicStateCodelabTheme","BasicStateCodelabTheme")
        Surface(
          modifier = Modifier.fillMaxSize(),
          color = MaterialTheme.colors.background
        ) {
          Log.e("Surface","Surface")
          WellnessScreen()
        }
      }
    }
  }
}
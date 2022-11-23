package com.codelabs.basicstatecodelab

import android.util.Log
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier

@Composable
fun StatefulCounter(modifier: Modifier = Modifier) {
  Log.e("StatefulCounter","StatefulCounter")
  var waterCount by rememberSaveable { mutableStateOf(0) }
//  var juiceCount by rememberSaveable { mutableStateOf(0) }
  StatelessCounter(count = waterCount, onIncrement = { waterCount++ }, modifier = modifier)
//  StatelessCounter(count = juiceCount, onIncrement = { juiceCount++ }, modifier = modifier)
}
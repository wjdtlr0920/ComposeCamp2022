package com.codelabs.basicstatecodelab

import android.annotation.SuppressLint
import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@SuppressLint("UnrememberedMutableState")
@Preview
@Composable
fun WaterCounter(modifier: Modifier = Modifier) {
  Column(modifier = modifier.padding(16.dp)) {
    var count by rememberSaveable { mutableStateOf(0) }
    if (count > 0) {
      Text("You've had $count glasses.")
    }
    Button(onClick = { count++ }, Modifier.padding(top = 8.dp), enabled = count < 10) {
      Text("Add one")
    }
  }
}
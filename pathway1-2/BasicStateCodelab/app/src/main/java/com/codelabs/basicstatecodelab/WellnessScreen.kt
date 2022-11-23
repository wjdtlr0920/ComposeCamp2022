package com.codelabs.basicstatecodelab

import android.annotation.SuppressLint
import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel

@SuppressLint("UnrememberedMutableState")
@Composable
fun WellnessScreen(
  modifier: Modifier = Modifier,
  wellnessViewModel: WellnessViewModel = viewModel()
) {
  Log.e("WellnessScreen","WellnessScreen")

  Column(modifier = modifier) {
    StatefulCounter()
    WellnessTasksList(
      list = wellnessViewModel.tasks,
      onCloseTask = { task -> wellnessViewModel.remove(task) },
      onCheckedTask = { task, checked -> wellnessViewModel.changeTaskChecked(task, checked) }
    )
  }
}
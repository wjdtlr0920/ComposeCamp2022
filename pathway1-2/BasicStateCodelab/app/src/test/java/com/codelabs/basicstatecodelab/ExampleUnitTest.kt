package com.codelabs.basicstatecodelab

import kotlinx.coroutines.*
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
  @Test
  fun addition_isCorrect() {

    println(UI(TransparentWindow()).asd())
    println(UI(TransparentWindow()).getWidth())
    println(UI(TransparentWindow()).getHeight())

//        println(TransparentWindow().asd())
    println(TransparentWindow().getWidth())
    println(TransparentWindow().getHeight())

  }


  interface IWindow {
    fun getWidth(): Int
    fun getHeight(): Int
  }

  open class TransparentWindow : IWindow {
    override fun getWidth(): Int {
      return 100
    }

    override fun getHeight(): Int {
      return 150
    }
  }

  class UI(window: IWindow) : IWindow by window {
    fun asd() = "asd"
  }


  @Test
  fun coroutineTest1() = runBlocking {

    launch {
      delay(200L)
      println("Task from runBlocking") // 1
    }

    coroutineScope { // 코루틴 스코프 생성
      launch {
        delay(500L)
        println("Task from nested launch") // 2
      }

      println("Task from coroutine scope") // 3
    }

    println("Coroutine scope is over") // 4
  }

  @Test
  fun coroutineTest2() = runBlocking {
    launch {
      println("point 1")
      delay(200L)
      println("Task from runBlocking")
    }

    println("point 2")

    coroutineScope {
      println("point 3")

      launch {
        println("point 4")
        delay(500L)
        println("Task from nested launch")
      }

      println("point 5")

      delay(100L)

      println("Task from coroutine scope")
    }

    println("Coroutine scope is over")
  }

  @Test
  fun coroutineTest3() = GlobalScope.launch {
    launch {
      println("point 1")
      delay(200L)
      println("Task from runBlocking")
    }

    println("point 2")

    coroutineScope {
      println("point 3")

      launch {
        println("point 4")
        delay(500L)
        println("Task from nested launch")
      }

      println("point 5")
      delay(100L)
      println("Task from coroutine scope")
    }

    println("Coroutine scope is over")
  }

  // 1 2 3 4 5

}
package com.example.happybirthday

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        main()
        birthdayWithBanner()
        bDayCakeWithCandles()
    }
}

fun main(){
    //personalization
    val age = 5 * 365
    val name ="Rover"

    //birthday message
    println("Happy Birthday, ${name}!")

    println(" ")

    //birthday cake
    println("   ,,,,,   ")
    println("   |||||   ")
    println(" =========")
    println("@@@@@@@@@@@")
    println("{~@~@~@~@~}")
    println("@@@@@@@@@@@")
    println(" ")

    //celebration
    println("You are already ${age} days old ${name}!")
    println("${age} days old is the very best age to celebrate!")

    println("-----------------------------------------------------------------")
    println(" ")
}



fun birthdayWithBanner(){
    println("Birthday Celebration With Banner")
    val border = "`-._,-'"
    val timesToRepeat = 4
    printBorder(border, timesToRepeat)
    println("Happy Birthday, Jhansi!")
    printBorder(border, timesToRepeat)
}

fun printBorder(border: String, timesToRepeat: Int){
    repeat(timesToRepeat){
        print(border)
    }
    println()
    println("-----------------------------------------------------------------")
    println(" ")
}

fun bDayCakeWithCandles(){
    println("Birthday Cake With Candles and Layers")
    var age = 24
    var layers = 2
    printCakeCandles(age)
    printCakeTop(age)
    printCakeBottom(age, layers)
}

fun printCakeCandles(age: Int){
    repeat(age){
        print(",")
    }
    println()
    repeat(age){
        print("|")
    }
    println()
}

fun printCakeTop(age: Int){
    repeat(age){
        print("=")
    }
    println()
}
fun printCakeBottom(age: Int, layers: Int){
    repeat(layers){
        repeat(age+2){
            print("@")
        }
        println()
    }
}
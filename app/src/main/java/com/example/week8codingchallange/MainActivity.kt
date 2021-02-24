package com.example.week8codingchallange

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    var lastFibonacciNumber: Int = 100
    var index: Int = 0
    var nthNumber: Int = 0
    var n1thNumber: Int = 1

    for(index in 0..lastFibonacciNumber){
        if(index == 0){
            println(1)
        }
        var sum: Int = nthNumber + n1thNumber
        nthNumber = n1thNumber
        n1thNumber = sum
        println(sum)
    }
}
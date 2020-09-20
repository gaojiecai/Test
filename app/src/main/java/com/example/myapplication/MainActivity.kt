package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun mytest():Int = 0

    fun mytest2():String = "aaa"

    fun mytest3():Boolean = false

    fun mytest4():Int = 1

    fun mytest5():String = "bbb"

    fun devbranch():String{
        return "master"
    }
}
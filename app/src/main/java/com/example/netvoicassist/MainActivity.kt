package com.example.netvoicassist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

fun main(): String {
    var name = "Ivan"
    var surname = "Ivanov"
    var age = 37
    var height = 172.2

    val sum = "name: $name surname: $surname age: $age height: $height"
    return sum
}

class MainActivity : AppCompatActivity() {
    val TAG: String = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val output: TextView = findViewById(R.id.output)
        output.text = main()

        val sum = main()
        Log.d(TAG, sum)

        var button: Button = findViewById(R.id.button)

    }
}
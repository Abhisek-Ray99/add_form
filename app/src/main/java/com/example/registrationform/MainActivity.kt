package com.example.registrationform

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btS = findViewById<Button>(R.id.SBtn)
        val EtRoll = findViewById<EditText>(R.id.roll)
    }
}

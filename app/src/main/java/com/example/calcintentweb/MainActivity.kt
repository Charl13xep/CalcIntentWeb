package com.example.calcintentweb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    var ButtonCalc:Button ?= null
    var ButtonIntent:Button ?= null
    var ButtonWeb:Button ?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ButtonCalc=findViewById(R.id.btn_calc)
        ButtonCalc!!.setOnClickListener {
            val intent = Intent(this, CalculatorActivity::class.java)
            startActivity(intent)
        }
        ButtonIntent=findViewById(R.id.btn_intent)
        ButtonIntent!!.setOnClickListener {
            val intent=Intent(this, IntentActivity::class.java)
            startActivity(intent)

        }
        ButtonWeb=findViewById(R.id.btn_web)
        ButtonWeb!!.setOnClickListener {
            val intent=Intent(this, WebActivity::class.java)
            startActivity(intent)
        }

    }
}
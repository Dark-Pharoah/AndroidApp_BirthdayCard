package com.example.birthdaycard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class BirthdayGreetingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greeting)


        val name = intent.getStringExtra("name")

        val textbox = findViewById<TextView>(R.id.textView)
        textbox.setText("Happy Birthday\n$name!")
    }
}
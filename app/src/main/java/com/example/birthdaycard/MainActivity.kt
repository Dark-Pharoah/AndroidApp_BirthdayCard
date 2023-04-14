package com.example.birthdaycard

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var name = findViewById<EditText>(R.id.TextEnter)
        var createButton = findViewById<Button>(R.id.createButton)

        createButton.setOnClickListener {
            val name = name.editableText.toString()
            Toast.makeText(this, "hello $name", Toast.LENGTH_SHORT).show()

            val inputManager:InputMethodManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            inputManager.hideSoftInputFromWindow(currentFocus!!.windowToken, InputMethodManager.SHOW_FORCED)

            val intent = Intent(this, BirthdayGreetingActivity::class.java)
            intent.putExtra("name" ,name)
            startActivity(intent)

        }


    }



}
package com.example.my_first_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText

const val EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val str = "onCreate"
        Log.i("Lifecycle", str)
    }

    override fun onStart() {
        super.onStart()
        val str = "onStart"
        Log.i("Lifecycle", str)
    }

    override fun onResume() {
        super.onResume()
        val str = "onResume"
        Log.i("Lifecycle", str)
    }

    override fun onPause() {
        super.onPause()
        val str = "onPause"
        Log.i("Lifecycle", str)
    }

    override fun onStop() {
        super.onStop()
        val str = "onStop"
        Log.i("Lifecycle", str)
    }

    override fun onRestart() {
        super.onRestart()
        val str = "onRestart"
        Log.i("Lifecycle", str)
    }

    override fun onDestroy() {
        super.onDestroy()
        val str = "onDestroy"
        Log.i("Lifecycle", str)
    }

    fun sendMessage(view: View) {
        val editText = findViewById<EditText>(R.id.editTextTextPersonName)
        val message = editText.text.toString()
        val intent = Intent(this, DisplayMessageActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE, message)
        }
        startActivity(intent)

    }

}

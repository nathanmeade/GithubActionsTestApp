package com.meadetechnologies.githubactionstestapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.meadetechnologies.connectionerrorjoke.ConnectionErrorJoke

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textView = findViewById<TextView>(R.id.textView)
        val textView2 = findViewById<TextView>(R.id.textView2)
        textView.text = BuildConfig.apiKey
        textView2.text = ConnectionErrorJoke.getJoke()
    }
}

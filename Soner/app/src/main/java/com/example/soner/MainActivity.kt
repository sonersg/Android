package com.example.soner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.SeekBar
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton = findViewById<Button>(R.id.button)
        val resultsTextView = findViewById<TextView>(R.id.resultButton)
//        val seekBar = findViewById<SeekBar>(R.id.seekBar)

        var c: Int = 0;
        rollButton.setOnClickListener {
//            val rand = Random().nextInt(11)
//            val rand = Random().nextInt(seekBar.progress)
//            resultsTextView.text = rand.toString()
            when (c) {
                0 -> resultsTextView.text = "I love Soner."
                1 -> resultsTextView.text = "He is so romantic."
                2 -> resultsTextView.text = "I am gonna marry him."
                3 -> resultsTextView.text = "He will be my lovely baby boy."
            }
            if (c >= 3) c = -1
            c++
        }
    }
}
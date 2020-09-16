package com.example.madlevel1example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.madlevel1example.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnConfirm.setOnClickListener {
            checkAnswer()
        }
    }

    private fun checkAnswer() {
        // Getting text from edit text value
        val answer = binding.etAnswer.text.toString()

        // Correct answer from R 'resources' strings.xml
        if (answer == getString(R.string.giraffe)) {

            // Creates a material toast for this context, with text and length
            // Shows it immediately
            Toast.makeText(this, getString(R.string.correct), Toast.LENGTH_LONG).show()
        } else {
            Toast.makeText(this, getString(R.string.incorrect), Toast.LENGTH_LONG).show()
        }
    }
}
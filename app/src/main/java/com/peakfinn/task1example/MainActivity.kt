package com.peakfinn.task1example

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnConfirm.setOnClickListener {
            checkAnswer()
        }
    }

    private fun checkAnswer() {
        val messageId = if (etAnswer.text.toString() == getString(R.string.answer)) {
            R.string.correct
        } else {
            R.string.incorrect
        }

        Toast.makeText(this.applicationContext, messageId, Toast.LENGTH_SHORT).show()
    }
}

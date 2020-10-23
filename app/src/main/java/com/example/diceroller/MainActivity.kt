package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rollDice()

    }

    private fun rollDice() {
        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener {
            val dice = Dice(6)
            val diceRoll = dice.roll();
            val diceIamge: ImageView = findViewById(R.id.imageView)
            when(diceRoll) {
                1 -> diceIamge.setImageResource(R.drawable.dice_1)
                2 -> diceIamge.setImageResource(R.drawable.dice_2)
                3 -> diceIamge.setImageResource(R.drawable.dice_3)
                4 -> diceIamge.setImageResource(R.drawable.dice_4)
                5 -> diceIamge.setImageResource(R.drawable.dice_5)
                6 -> diceIamge.setImageResource(R.drawable.dice_6)
            }
        }
    }
}
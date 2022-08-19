package com.example.diceroll

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)   // to store the value of roll button in rollButton

        // rollButton.setOnClickListener { } - it contains the program, which has to run after clicking on the Button

        rollButton.setOnClickListener {
            Toast.makeText(this, "Dice Rolled !!!", Toast.LENGTH_SHORT).show()   // to display a message on clicking the button
            rollDice()
            //val resultTextView: TextView = findViewById(R.id.textView) // creates a variable to store the output value
            //resultTextView.text = "6" // to store the value in form of string as it only prints string


        }
    }

    private fun rollDice() {
        val dice1 = Dice(6) // calls and send a value to class Dice, i.e creates object for class Dice
        val dice2 = Dice(6)
        val dice1Roll = dice1.roll() // call the function and stores the return value
        val dice2Roll = dice2.roll()


        val resultTextView1: TextView = findViewById(R.id.textView)
        resultTextView1.text = (dice1Roll).toString() // toString - to convert the following into string; It prints the value stored in diceRoll, after changing it into string using .toString

        val resultTextView2: TextView = findViewById(R.id.textView5)
        resultTextView2.text = (dice2Roll).toString()
    }
}

class Dice(private val sides: Int) {  // class creation because class Dice is like a Blue-print for all the dices which would be used in the future

    fun roll(): Int {   // function creation, which is being called
        return (1..sides).random() // .. represents the range from 1 to sides or from any number to any number given in the function, And Random just gives a random value from the previous range
    }
}
package com.example.diceroll

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
//import android.widget.TextView
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

        rollDice() // to show a random number in the start, without clicking the button, iske bina app khaali khaali lagta hai
    }

    private fun rollDice() {
        val dice1 = Dice(6) // calls and send a value to class Dice, i.e creates object for class Dice
        //val dice2 = Dice(6)

        val dice1Roll = dice1.roll() // call the function and stores the return value
        //val dice2Roll = dice2.roll()


        // to display the number for dice 1
        //val resultTextView1: TextView = findViewById(R.id.textView)
        //resultTextView1.text = (dice1Roll).toString() // toString - to convert the following into string; It prints the value stored in diceRoll, after changing it into string using .toString

        // to display the number for dice 2
        //val resultTextView2: TextView = findViewById(R.id.textView5)
        //resultTextView2.text = (dice2Roll).toString()

        val dice1Image: ImageView=findViewById(R.id.imageView)

        val drawable1Resource=when(dice1Roll){  // statement to check the number, R.drawable can change the content of diceImage, and place the required image to be displayed
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> {R.drawable.dice_6} // use of else is there, to save the 'when' function from being exhausted
        }
        dice1Image.setImageResource(drawable1Resource)  // set.ImageResource - it changes the content of the image view

        dice1Image.contentDescription = dice1Roll.toString() // to read out the number loud, but sunai nahi de raha hai, ya toh shayad se bas system mei description karta hai ki kis kaam ke liye yeh imageview bana hai

//        val dice2Image: ImageView=findViewById(R.id.imageView2)

  /*      val drawable2Resource=when(dice2Roll){  // statement to check the number, R.drawable can change the content of diceImage, and place the required image to be displayed
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> {R.drawable.dice_6} // use of else is there, to save the 'when' function from being exhausted
        }
        dice2Image.setImageResource(drawable2Resource)

        dice2Image.contentDescription = dice2Roll.toString()
*/
    }
}

class Dice(private val sides: Int) {  // class creation because class Dice is like a Blue-print for all the dices which would be used in the future

    fun roll(): Int {   // function creation, which is being called
        return (1..sides).random() // .. represents the range from 1 to sides or from any number to any number given in the function, And Random just gives a random value from the previous range
    }
}
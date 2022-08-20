package com.example.diceroll

import org.junit.Test

//import org.junit.Assert.*
import org.junit.Assert.assertTrue

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */

/*class ExampleUnitTest {
    @Test // used to tell the system that it is a test function
    fun addition_isCorrect() { // functions are true to their name, jaise isme addition check hota hai
        assertEquals(5, 2 + 3) //aur yeh equals to dekhta hai
    }
}*/

class ExampleUnitTest{
    @Test
    fun generate_number(){
        val side = 6
        val dice=Dice(side)
        val rollResult=dice.roll()
        // val rollResult=7 // just for testing
        assertTrue("The value of rollResult was not between 1 and 6",rollResult in 1..side)
    }
}
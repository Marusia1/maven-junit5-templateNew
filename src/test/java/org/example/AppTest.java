package org.example;

import org.junit.jupiter.api.Test;

import java.util.Calendar;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test for simple App.
 */
public class AppTest {

//1. Check the sum of two positive integer values
    @Test
    public void checkTwoPositiveValuesEquals(){
        Calculator calculator = new Calculator();
// assertEquals(expected: 3, actual: 2);

        assertEquals( 4 , calculator.calculateSumOfTwoIntegerValues(2, 2));
    }

    @Test
    public void checkTwoNegativeValuesEquals(){

        // precondition
        Calculator calculator = new Calculator();
// assertEquals(expected: 3, actual: 2);

        assertEquals( -4 , calculator.calculateSumOfTwoIntegerValues(-2, -2));
    }


    @Test
    public void checkTwoValuesNotEquals(){
        assertNotEquals( 3 , 4);
    }




    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( 3 == 3 );
    }

    @Test
    public void shouldAnswerWithFalse()
    {
        assertFalse( 4 < 2 );
    }


}

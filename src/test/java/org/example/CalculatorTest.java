package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 * Unit test for simple App.
 */
public class CalculatorTest
{

    @Test
    public void twoPlusTwoShouldBe4Add(){
        //Arrange Act Assert
        Calculator calculator = new Calculator();
        assertEquals(4, calculator.add(2,2));
        assertTrue(calculator.add(2,2) == 4);
    }

    @Test
    public void threePlusSevenShouldBe10Add(){
        Calculator calculator = new Calculator();
        assertEquals(10, calculator.add(3,7));
        assertTrue(calculator.add(3,7) == 10);
    }

    @Test
    public void twoPlusTwoNot4Add(){
        Calculator calculator = new Calculator();
        assertNotEquals(9, calculator.add(2,2));
        assertFalse(calculator.add(2, 2) == 9);
    }

    @Test
    public void twoMinusTwoShouldBe0Subtract(){
        Calculator calculator = new Calculator();
        assertEquals(0, calculator.subtract(2,2));
        assertTrue(calculator.subtract(2,2) == 0);
    }

    @Test
    public void twoMinusTwoNot0Subtract(){
        Calculator calculator = new Calculator();
        assertNotEquals(9, calculator.subtract(2,2));
        assertFalse(calculator.subtract(2,2)==3);
    }

    @Test
    public void numIsEqual(){
        Calculator calculator = new Calculator();
        assertTrue(calculator.numEqualsNum(2,2));
    }

    @Test
    public void numNotEqual(){
        Calculator calculator = new Calculator();
        assertFalse(calculator.numEqualsNum(2,1));
    }

}

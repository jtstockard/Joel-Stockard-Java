package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    Calculator calc;

    @Before
    public void setUp() throws Exception {
        calc = new Calculator();
    }

    @Test
    public void shouldAddInt() {
        assertEquals(2, calc.add(1,1));
        assertEquals(2, calc.add(10,-8));

    }

    @Test
    public void shouldSubtractInt() {
        assertEquals(-29, calc.subtract(23, 52));
        assertEquals(9, calc.subtract(19, 10));

    }

    @Test
    public void shouldMultiplyInt() {
        assertEquals(68, calc.multiply(34, 2));
        assertEquals(-8, calc.multiply(4, -2));
    }

    @Test
    public void shouldDivideInt() {
        assertEquals(4, calc.divide(12,3));
        assertEquals(1.0, calc.divide(12, 7), 0.01);
    }

    @Test
    public void shouldAddDouble() {
        assertEquals(5.7, calc.add(3.4, 2.3), .01);
        assertEquals(19.4, calc.add(17.3, 2.1), .01);
    }

    @Test
    public void shouldSubtractDouble() {
        assertEquals(5.0, calc.subtract(5.5,0.5),0.01);
        assertEquals(7.2, calc.subtract(10.9,3.7),0.01);
    }

    @Test
    public void shouldMultiplyDouble() {
        assertEquals(29.4, calc.multiply(6.7,4.4),0.1);
        assertEquals(8.4, calc.multiply(2.1,4),0.1);

    }

    @Test
    public void shouldDivideIntAndReturnDouble() {
        assertEquals(4.9, calc.divide(10.8, 2.2),0.01);
    }

}

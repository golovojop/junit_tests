package edu.barabu.junit_test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
    Calculator calc;
    int a;
    int b;



    @Before
    public void setUp(){
        calc = new Calculator();
        a = 11;
        b = 0;
    }

    @Test
    public void testAdd() throws Exception {
        int expected = a + b;
        assertEquals(expected, calc.add(a, b));
    }

    @Test
    public void testSub() throws Exception {
        int expected = a - b;
        assertEquals(expected, calc.sub(a, b));
    }

    @Test
    public void testMul() throws Exception {
        int expected = a * b;
        assertEquals(expected, calc.mul(a, b));
    }

    @Test
    public void testDiv() throws Exception {
        int expected = (b == 0) ? 0 : (a / b);
        assertEquals(expected, calc.div(a, b));
    }




}

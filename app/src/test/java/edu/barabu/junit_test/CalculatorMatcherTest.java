package edu.barabu.junit_test;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class CalculatorMatcherTest {

    Calculator calc;
    int nA, nB;

    @Before
    public void setUp() {
        calc = new Calculator();
        nA = 10;
        nB = 2;
    }

    @Test
    public void testAdd() throws Exception {
        assertThat(calc.add(nA, nB), is(12));
    }

}

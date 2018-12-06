package edu.barabu.junit_test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class RemoteCalculatorTest {

    final int OP_ADD = 1;
    final int OP_SUB = 2;
    final int OP_MUL = 3;
    final int OP_DIV = 4;

    int nA, nB;

    RemoteCalculator rcalc;

    @Before
    public void setUp() {
        rcalc = new RemoteCalculator();
        nA = 11;
        nB = 0;
    }

    @Test
    public void testAll() {

        int expected = nA + nB;
        assertEquals(expected, rcalc.responder(OP_ADD, nA, nB));

        expected = nA - nB;
        assertEquals(expected, rcalc.responder(OP_SUB, nA, nB));

        expected = nA * nB;
        assertEquals(expected, rcalc.responder(OP_MUL, nA, nB));

        expected = (nB == 0) ? 0 : (nA / nB);
        assertEquals(expected, rcalc.responder(OP_DIV, nA, nB));
    }
}

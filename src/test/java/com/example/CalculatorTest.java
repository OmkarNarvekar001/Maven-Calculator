package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Ops ops = new Ops();
        assertEquals(9, ops.add(6, 3));
    }

    @Test
    public void testSubtract() {
        Ops ops = new Ops();
        assertEquals(6, ops.subtract(8, 2));
    }

    @Test
    public void testMultiply() {
        Ops ops = new Ops();
        assertEquals(15, ops.mult(3, 5));
    }

    @Test
    public void testDivide() {
        Ops ops = new Ops();
        assertEquals(5, ops.divd(10, 2));
    }
}

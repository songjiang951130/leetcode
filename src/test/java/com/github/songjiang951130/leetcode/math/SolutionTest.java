package com.github.songjiang951130.leetcode.math;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    Divide divide = new Divide();

    @Test
    public void mySqrt() {
        assertEquals(2, divide.mySqrt(4));
        assertEquals(2, divide.mySqrt(8));
        assertEquals(1, divide.mySqrt(1));
        assertEquals(2, divide.mySqrt(5));
        assertEquals((int) Math.sqrt(2147395599), divide.mySqrt(2147395599));
    }
}
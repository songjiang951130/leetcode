package com.github.songjiang951130.leetcode.math;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    Divide divide = new Divide();
    Solution solution = new Solution();

    @Test
    public void mySqrt() {
        assertEquals(2, divide.mySqrt(4));
        assertEquals(2, divide.mySqrt(8));
        assertEquals(1, divide.mySqrt(1));
        assertEquals(2, divide.mySqrt(5));
        assertEquals((int) Math.sqrt(2147395599), divide.mySqrt(2147395599));
    }

    @Test
    public void testMultiply() {
        Assert.assertEquals("6", solution.multiply("2", "3"));
        System.out.println();
        Assert.assertEquals("36", solution.multiply("12", "3"));
        System.out.println();
        Assert.assertEquals("56088", solution.multiply("123", "456"));
    }
}
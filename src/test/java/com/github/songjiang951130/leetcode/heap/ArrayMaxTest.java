package com.github.songjiang951130.leetcode.heap;

import junit.framework.TestCase;

import static org.junit.Assert.assertArrayEquals;

public class ArrayMaxTest extends TestCase {

    public void testMaxSlidingWindow() {
        //warning 超时
        ArrayMax solution = new ArrayMax();
        assertArrayEquals(new int[]{3, 3, 5, 5, 6, 7}, solution.maxSlidingWindow(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3));
        assertArrayEquals(new int[]{1}, solution.maxSlidingWindow(new int[]{1}, 1));
    }
}
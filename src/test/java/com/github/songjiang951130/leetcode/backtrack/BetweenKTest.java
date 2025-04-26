package com.github.songjiang951130.leetcode.backtrack;

import junit.framework.TestCase;

public class BetweenKTest extends TestCase {
    BetweenK betweenK = new BetweenK();

    public void testCountSubArrays() {
        long l = betweenK.countSubArrays(new int[]{1, 3, 5, 2, 7, 5}, 1, 5);
        assertEquals(2, l);
        long l2 = betweenK.countSubArraysV2(new int[]{1, 3, 5, 2, 7, 5}, 1, 5);
        assertEquals(2, l2);
        long l23 = betweenK.countSubArraysV2(new int[]{1,1,1,1}, 1, 1);
        assertEquals(10, l23);

    }
}
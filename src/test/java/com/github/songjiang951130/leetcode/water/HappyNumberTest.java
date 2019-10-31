package com.github.songjiang951130.leetcode.water;

import org.junit.Test;

import static org.junit.Assert.*;

public class HappyNumberTest {
    HappyNumber happyNumber = new HappyNumber();

    @Test
    public void isHappy() {
        assertTrue(happyNumber.isHappy(19));
        //49
        // 16 + 81 = 97
        // 81 + 49 = 130
        // 1 + 9   = 10
        // 1 + 0 = 1
        assertTrue(happyNumber.isHappy(7));
        /**
         * 2
         * 4 = 4
         * 16 = 16
         * 1 + 36 = 37
         * 9 + 49 = 58
         * 25 + 64 = 89
         * 64 + 81 = 145
         * 1 + 16 + 25 = 42
         * 16 + 4 = 20
         * 4
         */
        assertFalse(happyNumber.isHappy(2));
    }
}
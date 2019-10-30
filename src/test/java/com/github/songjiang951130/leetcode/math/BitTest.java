package com.github.songjiang951130.leetcode.math;

import org.junit.Test;

import static org.junit.Assert.*;

public class BitTest {
    Bit bit = new Bit();

    @Test
    public void rangeBitwiseAnd() {
        assertEquals(4, bit.rangeBitwiseAnd(5, 7));
        assertEquals(0, bit.rangeBitwiseAnd(0, Integer.MAX_VALUE));
    }
}
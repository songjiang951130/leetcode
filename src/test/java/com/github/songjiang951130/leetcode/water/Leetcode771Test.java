package com.github.songjiang951130.leetcode.water;

import org.junit.Test;

import static org.junit.Assert.*;

public class Leetcode771Test {

    @Test
    public void numJewelsInStones() {
        Leetcode771 leetcode = new Leetcode771();
        String J = "aA";
        String S = "aAAbbbb";
        assertEquals(3,leetcode.numJewelsInStones(J,S));
        J ="z";
        S = "ZZ";
        assertEquals(0,leetcode.numJewelsInStones(J,S));
    }
}
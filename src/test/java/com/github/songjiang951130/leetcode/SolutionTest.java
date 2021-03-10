package com.github.songjiang951130.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    @Test
    public void removeDuplicates() {
        Solution solution = new Solution();
        String res = solution.removeDuplicates("abbaca");
        assertEquals("ca", res);
    }
}
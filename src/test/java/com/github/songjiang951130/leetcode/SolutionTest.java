package com.github.songjiang951130.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    Solution solution = new Solution();

    @Test
    public void removeDuplicates() {
        String res = solution.removeDuplicates("abbaca");
        assertEquals("ca", res);
    }
}
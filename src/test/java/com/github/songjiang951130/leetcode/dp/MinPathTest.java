package com.github.songjiang951130.leetcode.dp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinPathTest {
    MinPath minPath = new MinPath();

    @Test
    public void minPathSum() {
        int[][] case1 = new int[][]{
                {1, 3, 1},
                {1, 5, 1},
                {4, 2, 1},
        };
        assertEquals(7, minPath.minPathSum(case1));

        int[][] case2 = new int[][]{
                {1, 3, 1}
        };
        assertEquals(5, minPath.minPathSum(case2));
    }
}
package com.github.songjiang951130.leetcode.dp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MediumTest {

    @Test
    public void minFallingPathSum() {
        int[][] a = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };
        PathSum pathSum = new PathSum();
        assertEquals(12, pathSum.minFallingPathSum(a));
        int[][] a2 = {
                {69}
        };
        assertEquals(69, pathSum.minFallingPathSum(a2));
    }
}

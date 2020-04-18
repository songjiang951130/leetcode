package com.github.songjiang951130.leetcode.dfs;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IslandTest {
    Island island = new Island();

    @Test
    public void numIslands() {
        char[][] case1 = {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'},
        };
        assertEquals(3, island.numIslands(case1));
    }

    @Test
    public void maxIslans() {
        int[][] case1 = {
                {0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0}
        };
        Assert.assertEquals(6, island.maxAreaOfIsland(case1));


        int[][] case2 = {
                {0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0},
        };
        Assert.assertEquals(2, island.maxAreaOfIsland(case2));
    }
}
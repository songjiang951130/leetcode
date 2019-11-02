package com.github.songjiang951130.leetcode.dfs;

import org.junit.Test;

import static org.junit.Assert.*;

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
}
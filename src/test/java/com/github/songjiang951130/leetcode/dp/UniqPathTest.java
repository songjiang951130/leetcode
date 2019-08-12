package com.github.songjiang951130.leetcode.dp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UniqPathTest {
    @Test
    public void testUniquePaths() {
        UniqPath uniqPath = new UniqPath();
        assertEquals(3, uniqPath.uniquePaths(3, 2));
    }

    @Test
    public void uniquePathsWithObstacles() {
        UniqPath uniqPath = new UniqPath();
        int[][] array = {
                {0, 0, 0},
                {0, 1, 0},
                {0, 0, 0},
        };
        assertEquals(2, uniqPath.uniquePathsWithObstacles(array));
        // case {{1,0}} 0
        int[][] case2 = {
                {1},
                {0},
        };
        assertEquals(0, uniqPath.uniquePathsWithObstacles(case2));
        int[][] case3 = {
                {1, 0}
        };
        assertEquals(0, uniqPath.uniquePathsWithObstacles(case3));

        //起始点有障碍
        int[][] case4 = {
                {1, 0},
                {0, 0}
        };
        assertEquals(0, uniqPath.uniquePathsWithObstacles(case4));

        //有一行障碍
        int[][] case5 = {
                {0, 0},
                {1, 1},
                {0, 0}
        };
        assertEquals(0, uniqPath.uniquePathsWithObstacles(case5));
        int[][] case6 = {
                {1},
        };
        assertEquals(0, uniqPath.uniquePathsWithObstacles(case6));
        int[][] case7 = {
                {0},
                {1},
        };
        assertEquals(0, uniqPath.uniquePathsWithObstacles(case7));
        int[][] case8 = {
                {0,1,0,0,0},
                {1,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
        };
        assertEquals(0, uniqPath.uniquePathsWithObstacles(case8));
    }
    @Test
    public void testDebug(){
        UniqPath uniqPath = new UniqPath();
        //有一行障碍
        int[][] case5 = {
                {0, 0},
                {1, 1},
                {0, 0}
        };
        assertEquals(0, uniqPath.uniquePathsWithObstacles(case5));
    }
}
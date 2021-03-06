package com.github.songjiang951130.leetcode.dp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    ArraySolution arraySolution;

    public SolutionTest() {
        this.arraySolution = new ArraySolution();
    }

    @Test
    public void testCase1() {
        int[] array = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        assertEquals(6, arraySolution.maxSubArrayEasyUnderstand(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
        assertEquals(1, arraySolution.maxSubArrayEasyUnderstand(new int[]{-2, 1}));
        assertEquals(0, arraySolution.maxSubArrayEasyUnderstand(null));
        assertEquals(0, arraySolution.maxSubArrayEasyUnderstand(new int[]{}));

        assertEquals(6, arraySolution.maxSubArray(array));
        assertEquals(6, arraySolution.maxSubArrayByForce(array));
        assertEquals(6, arraySolution.maxSubArrayLowMemory(array));
    }

    @Test
    public void testClimbStairs() {
        assertEquals(1, arraySolution.climbStairs(1));
        assertEquals(2, arraySolution.climbStairs(2));
        assertEquals(3, arraySolution.climbStairs(3));
    }

    @Test
    public void testFib() {
        assertEquals(0, arraySolution.fib(0));
        assertEquals(1, arraySolution.fib(1));
        assertEquals(1, arraySolution.fib(2));
        assertEquals(2, arraySolution.fib(3));
        assertEquals(3, arraySolution.fib(4));
    }

    @Test
    public void testMaxProfit() {
        int[] case1 = {7, 1, 5, 3, 6, 4};
        // int 0 -6 4 -2 3 -2
        assertEquals(5, arraySolution.maxProfit(case1));
        int[] case2 = {7, 6, 4, 3, 1};
        assertEquals(0, arraySolution.maxProfit(case2));
        //[1,2]
        int[] case3 = {1, 2};
        assertEquals(1, arraySolution.maxProfit(case3));
        int[] case4 = {};
        assertEquals(0, arraySolution.maxProfit(case4));
    }

    @Test
    public void testMaxProfitForce() {
        int[] case1 = {7, 1, 5, 3, 6, 4};
        // int 0 -6 4 -2 3 -2
        assertEquals(5, arraySolution.maxProfitForce(case1));
        int[] case2 = {7, 6, 4, 3, 1};
        assertEquals(0, arraySolution.maxProfitForce(case2));
        //[1,2]
        int[] case3 = {1, 2};
        assertEquals(1, arraySolution.maxProfitForce(case3));
        int[] case4 = {};
        assertEquals(0, arraySolution.maxProfitForce(case4));
    }

    @Test
    public void testStoneGame() {
        int[] case1 = {5, 3, 4, 5};
        assertEquals(true, arraySolution.stoneGame(case1));
        System.out.println();

        int[] case2 = {3, 2, 10, 4};
        assertEquals(true, arraySolution.stoneGame(case2));

        int[] caseReturn = {4, 10, 2, 3};
        assertEquals(true, arraySolution.stoneGame(caseReturn));

        System.out.println();
        int[] myCase = {162,259,203,207,455,483,262,49,280,379};
        assertEquals(true, arraySolution.stoneGame(myCase));

        System.out.println();
        int[] case3 = {162,259,203,207,455,174,414,403,49,125,104,87,273,354,345,299,132,240,427,242,497,364,289,431,176,99,154,18,92,300,397,395,208,388,379,203,16,413,223,60,422,410,310,409,295,306,230,417,382,379,305,275,221,370,173,328,96,450,52,351,250,122,331,17,203,76,384,137,31,396,383,487,67,212,198,241,22,85,253,28,92,210,294,444,159,382,52,277,145,225,60,140,198,460,355,66,81,370,149,147,311,335,445,481,80,370,332,175,8,8,274,427,87,267,15,89,135,279,318,123,282,254,302,457,495,252,125,408,430,178,318,411,324,99,59,312,496,320,76,445,373,382,104,15,106,119,379,296,86,245,260,415,193,14,336,347,81,434,467,155,472,317,65,411,140,74,156,433,65,226,416,483,411,215,468,447,14,375,137,304,86,10,87,306,162,426,350,107,194,50,9,480,344,156,314,388,172,206,114,181,12,155,405,465,333,314,224,371,414,423,82,493,128,462,397,128,7,126,74,393,106,66,115,185,445,254,262,183,192,222,416,8,103,8,436,349,376,488,77,149,460,327,387,85,350,72,343,150,53,410,33,23,212,68,156,319,38,391,280,220,82,117,113,459,104,305,385,330,285,248,91,313,55,492,197,36,264,333,26,192,106,81,309,207,348,134,108,325,406,140,41,367,327,402,432,419,454,336,459,49,118,289,177,161,249,295,455,252,388,164,304,465,284,404,163,23,252,60,42,471,199,52,192,401,113,428,426,454,109,111,363,152,83,287,4,31,125,186,137,365,269,417,350,292,385,372,280,243,470,465,335,194,351,319,499,329,214,140,350,348,83,374,144,3,118,321,258,196,302,307,399,122,487,111,480,205,106,270,173,80,278,252,300,127,123,63,172,131,355,223,241,49,297,323,73,388,380,147,167,63,487,320,140,86,315,462,425,463,171,333,310,436,448,76,478,245,179,450,56,324,92,401,483,321,133,19,400,262,74,61,313,268,276,337,353,118,442,234,356,374,83,60,319,355,242,89,296,179,323,33,394,410,65,198,396,238,464,258,464,278,60,316,298,141,34,152,196,102,124,442,491,456,34,413,234,483,382,192,50,90,30,215,127,464,11,403,44,162,216,130,399,262,238,215,6,483,262,49,280,379};
        assertEquals(true, arraySolution.stoneGame(case3));
    }
}

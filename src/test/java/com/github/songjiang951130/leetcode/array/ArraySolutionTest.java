package com.github.songjiang951130.leetcode.array;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ArraySolutionTest {
    private ArraySolution arraySolution = new ArraySolution();

    @Test
    public void findMedianSortedArrays() {
        ArraySolution arraySolution = new ArraySolution();
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        assertEquals(2.0, arraySolution.findMedianSortedArrays(nums1, nums2), 0.0);
    }

    @Test
    public void arrayRankTransform() {
        arraySolution = new ArraySolution();
        assertTrue(Arrays.equals(new int[]{4, 1, 2, 3},
                arraySolution.arrayRankTransform(new int[]{40, 10, 20, 30})));
        assertTrue(Arrays.equals(new int[]{1, 1, 1}, arraySolution.arrayRankTransform(new int[]{100, 100, 100})));
    }


    @Test
    public void testMaxScore() {
        int maxScore = arraySolution.maxScore(new int[]{1, 2, 3, 4, 5, 6, 1}, 3);
        assertEquals(12, maxScore);
        int result2 = arraySolution.maxScore(new int[]{2, 2, 2}, 2);
        assertEquals(4, result2);

        int result3 = arraySolution.maxScore(new int[]{9, 7, 7, 9, 7, 7, 9}, 7);
        assertEquals(55, result3);

        int result4 = arraySolution.maxScore(new int[]{1, 1000, 1}, 1);
        assertEquals(1, result4);

        int result5 = arraySolution.maxScore(new int[]{1, 79, 80, 1, 1, 1, 200, 1}, 3);
        assertEquals(202, result5);
    }
}
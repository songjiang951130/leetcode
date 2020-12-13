package com.github.songjiang951130.leetcode.array;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ArraySolutionTest {
    private ArraySolution arraySolution = new ArraySolution();

    @Test
    public void findMedianSortedArrays() {
        ArraySolution arraySolution = new ArraySolution();
        int[] nums1 = { 1, 3 };
        int[] nums2 = { 2 };
        assertEquals(2.0, arraySolution.findMedianSortedArrays(nums1, nums2), 0.0);
    }

    @Test
    public void arrayRankTransform() {
        arraySolution = new ArraySolution();
        assertTrue(Arrays.equals(new int[] { 4, 1, 2, 3 },
                arraySolution.arrayRankTransform(new int[] { 40, 10, 20, 30 })));
        assertTrue(Arrays.equals(new int[] { 1, 1, 1 }, arraySolution.arrayRankTransform(new int[] { 100, 100, 100 })));
    }
}
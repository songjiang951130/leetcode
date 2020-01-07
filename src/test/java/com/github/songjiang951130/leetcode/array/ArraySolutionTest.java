package com.github.songjiang951130.leetcode.array;

import com.github.songjiang951130.ioc.core.Container;
import com.github.songjiang951130.ioc.core.annotation.Autowired;
import com.github.songjiang951130.leetcode.Main;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArraySolutionTest {
    @Autowired
    private ArraySolution arraySolution;

    @Before
    public void autowire() {
        new Container().run(Main.class);
    }

    @Test
    public void findMedianSortedArrays() {
        ArraySolution arraySolution = new ArraySolution();
        int[] nums1 = { 1, 3 };
        int[] nums2 = { 2 };
        assertEquals(2.0, arraySolution.findMedianSortedArrays(nums1, nums2), 0.0);
    }
}
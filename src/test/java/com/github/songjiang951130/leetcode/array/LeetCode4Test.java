package com.github.songjiang951130.leetcode.array;

import org.junit.Assert;
import org.junit.Test;

public class LeetCode4Test {

    @Test
    public void findMedianSortedArrays() {
        LeetCode4 leetCode = new LeetCode4();
        int[] case1 = {1, 2, 3};
        Assert.assertEquals(2.0, leetCode.findMedianSortedArrays(case1, null), 0.001);
        int[] case2 = {1, 2, 3};
        Assert.assertEquals(2.0, leetCode.findMedianSortedArrays(null, case2), 0.001);
        int[] case3 = {1, 2};
        Assert.assertEquals(1.5, leetCode.findMedianSortedArrays(null, case3), 0.001);
    }

    @Test
    public void findMedianSortedArraysCase2() {
        LeetCode4 leetCode = new LeetCode4();
        int[] case1 = {1, 3};
        int[] case2 = {2};
        Assert.assertEquals(2.0, leetCode.findMedianSortedArrays(case1, case2), 0.001);
    }

    /**
     * []
     * [1]
     */
    @Test
    public void findMedianSortedArraysCase3() {
        LeetCode4 leetCode = new LeetCode4();
        int[] case1 = {};
        int[] case2 = {1};
        Assert.assertEquals(1.0, leetCode.findMedianSortedArrays(case1, case2), 0.001);
    }

    @Test
    public void findMedianSortedArraysCase4() {
        LeetCode4 leetCode = new LeetCode4();
        int[] case1 = {};
        int[] case2 = {2, 3};
        Assert.assertEquals(2.5, leetCode.findMedianSortedArrays(case1, case2), 0.001);
    }

    @Test
    public void findMedianSortedArraysCase5() {
        LeetCode4 leetCode = new LeetCode4();
        int[] case1 = {2, 2, 2, 2};
        int[] case2 = {2, 2, 2};
        Assert.assertEquals(2.0, leetCode.findMedianSortedArrays(case1, case2), 0.001);
    }

    @Test
    public void findMedianSortedArraysCase6() {
        LeetCode4 leetCode = new LeetCode4();
        int[] case1 = {2, 2, 2};
        int[] case2 = {2, 2, 2, 2};
        Assert.assertEquals(2.0, leetCode.findMedianSortedArrays(case1, case2), 0.001);
    }

    /**
     * @todo 数据在一个分组上
     * [1,2]
     * [-1,3]
     */
//    @Test
//    public void findMedianSortedArraysCase7() {
//        LeetCode4 leetCode = new LeetCode4();
//        int[] case1 = {1, 2};
//        int[] case2 = {-1, 3};
//        Assert.assertEquals(1.5, leetCode.findMedianSortedArrays(case1, case2), 0.001);
//    }
}
package com.github.songjiang951130.leetcode.dp;

import org.junit.Assert;
import org.junit.Test;

public class ArrayIncreaseTest {
    ArrayIncrease arrayIncrease = new ArrayIncrease();

    @Test
    public void lengthOfLIS() {
        //获取数组最大递增子序列
        int[] case1 = new int[]{10,9,2,5,3,7,101,18};
        //sub array: 2,3,7,101
        Assert.assertEquals(4, arrayIncrease.lengthOfLIS(case1));
    }
}
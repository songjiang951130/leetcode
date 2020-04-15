package com.github.songjiang951130.leetcode.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class WhirlingTest {
    Whirling whirling = new Whirling();

    @Test
    public void rotate() {
//        int[] case1 = new int[]{1, 2, 3, 4, 5, 6, 7};
//        whirling.rotate(case1, 3);
//        Assert.assertTrue(Arrays.equals(case1, new int[]{5, 6, 7, 1, 2, 3, 4}));
        int[] case2 = new int[]{1, 2};
        whirling.rotate(case2, 1);
//        whirling.rotate(new int[]{1, 2, 3}, 1);
        Assert.assertTrue(Arrays.equals(case2, new int[]{2, 1}));

    }
}
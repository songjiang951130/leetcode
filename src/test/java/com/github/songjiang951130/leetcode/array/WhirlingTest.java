package com.github.songjiang951130.leetcode.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class WhirlingTest {
    Whirling whirling = new Whirling();

    @Test
    public void rotate() {
        int[] case2 = new int[]{1, 2};
        whirling.rotate(case2, 1);
        Assert.assertArrayEquals(new int[]{2, 1}, case2);
        int[] case3 = new int[]{1};
        whirling.rotate(case3, 0);
        Assert.assertArrayEquals(new int[]{1}, case3);
    }
}
package com.github.songjiang951130.leetcode.dp;

import org.junit.Assert;
import org.junit.Test;

public class Leetcode714Test {
    private Leetcode714 leetcode = new Leetcode714();

    @Test
    public void maxProfitCase() {
        int[] prices = { 1, 3, 2, 8, 4, 9 };
        int fee = 2;
        Assert.assertEquals(8, leetcode.maxProfit(prices, fee));
    }
}
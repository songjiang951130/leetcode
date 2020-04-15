package com.github.songjiang951130.leetcode.dp;

import org.junit.Test;

import static org.junit.Assert.*;

public class StockTest {
    @Test
    public void maxProfitV2() {
        Stock stock = new Stock();
        int[] case1 = { 7, 1, 5, 3, 6, 4 };
        assertEquals(7, stock.maxProfit(case1));

        int[] case2 = { 1, 2, 3, 4, 5 };
        assertEquals(4, stock.maxProfit(case2));
    }
    // maxProfitV3

    @Test
    public void maxProfitV3() {
        Stock stock = new Stock();
        int[] case1 = { 3, 3, 5, 0, 0, 3, 1, 4 };
        assertEquals(6, stock.maxProfitV3(case1));

        // int[] case2 = { 1, 2, 3, 4, 5 };
        // assertEquals(4, stock.maxProfitV3(case2));
    }
}
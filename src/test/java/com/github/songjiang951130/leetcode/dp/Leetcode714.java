package com.github.songjiang951130.leetcode.dp;

class Leetcode714 {
    public int maxProfit(int[] prices, int fee) {
        int profit = 0;
        int maxProfit = 0;
        int temp = 0;
        for (int i = 1; i < prices.length; i++) {
            profit += prices[i] - prices[i - 1];
//            if(){
//
//            }
        }
        return profit;
    }
}
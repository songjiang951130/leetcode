package com.github.songjiang951130.leetcode.dp;

public class Stock {
    /**
     * case 1 = [1, 3, 2, 8, 4, 9]
     * 
     * @param prices int[]
     * @param fee    int
     * @return
     */
    public int maxProfit(int[] prices, int fee) {
        int[] profit = new int[prices.length];

        return 8;
    }

    /**
     * 股票可以多次卖出 测试用例：[7,1,5,3,6,4] 7;[1,2,3,4,5] 5
     * 
     * @link https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
     * @param prices
     * @return
     */
    public int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            int temp = prices[i] > prices[i - 1] ? prices[i] - prices[i - 1] : 0;
            profit += temp;
        }
        return profit;
    }

    /**
     * 股票仅能卖出两次 [3,3,5,0,0,3,1,4]，6 在第四天买入 0股票卖出 3，7号1元买入8号4员卖出，最大利润6;
     * 
     * 可以扩展到n次最大利润
     * 
     * @link https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iii
     * @param prices
     * @return
     */
    public int maxProfitV3(int[] prices) {
        return 0;
    }

}
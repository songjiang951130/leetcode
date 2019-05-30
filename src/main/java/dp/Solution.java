package dp;

public class Solution {
    //最大连续子数组
    public int maxSubArray(int[] nums) {
        int[] dp = new int[nums.length];
        int max = nums[0];
        dp[0] = nums[0];
        for (int index = 1; index < nums.length; index++) {
            dp[index] = nums[index] + (dp[index - 1] > 0 ? dp[index - 1] : 0);
            max = dp[index] > max ? dp[index] : max;
        }
        return max;
    }

    public int maxSubArrayLowMemory(int[] nums) {
        int max = nums[0];
        int tmp = nums[0];
        for (int index = 1; index < nums.length; index++) {
            tmp = nums[index] + (tmp > 0 ? tmp : 0);
            max = tmp > max ? tmp : max;
        }
        return max;
    }

    //暴力求解最大子数组
    public int maxSubArrayByForce(int[] nums) {
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            int temp = 0;
            for (int j = i; j < nums.length; j++) {
                temp += nums[j];
                max = temp > max ? temp : max;
            }
        }
        return max;
    }

    /**
     * 爬楼梯 上一步或者两步，有多少种可能
     * 思路：n步楼梯等于 n-1步可能数加上 n-2的可能数
     * climbStairs(n) =climbStairs(n-1) + climbStairs(n-2)
     *
     * @param n
     * @return
     */
    public int climbStairs(int n) {
        int[] res = new int[n + 1];
        res[0] = 1;
        res[1] = 1;
        for (int i = 2; i < res.length; i++) {
            res[i] = res[i - 1] + res[i - 2];
        }
        return res[n];
    }

    /**
     * 斐波那契数列
     *
     * @param n
     * @return
     * @link https://leetcode.com/problems/fibonacci-number
     */
    public int fib(int n) {
        //f2 = f1 + f0 = 1 + 0
        if (n == 0) {
            return 0;
        }
        int[] res = new int[n + 1];
        res[0] = 0;
        res[1] = 1;
        for (int i = 2; i < res.length; i++) {
            res[i] = res[i - 1] + res[i - 2];
        }
        return res[n];
    }

    /**
     * 最大利润
     */
    public int maxProfit(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }
        int max = 0;
        int current = 0;
        for (int i = 1; i < prices.length; i++) {
            current += (prices[i] - prices[i - 1]) > 0 ? (prices[i] - prices[i - 1]) : 0;
            max = current > max ? current : max;
        }
        return max;
    }

    public int maxProfitForce(int[] prices) {
        int max = 0;
        for (int i = 0; i < prices.length; i++) {
            int tmp = 0;
            for (int j = i + 1; j < prices.length; j++) {
                tmp = prices[j] - prices[i];
                max = max > tmp ? max : tmp;
            }
        }
        return max;
    }

}
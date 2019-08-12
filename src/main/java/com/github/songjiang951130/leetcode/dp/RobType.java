package com.github.songjiang951130.leetcode.dp;

public class RobType {

    //1,2,3,1

    /**
     * 思路：计算dp[i] 当前的最大值，依赖的是 com.github.songjiang951130.leetcode.dp[i-1],nums[i]+com.github.songjiang951130.leetcode.dp[i-2]中的最大值
     * <p>
     * 特别注意，com.github.songjiang951130.leetcode.dp[1] = max(nums[0],nums[1])
     *
     * @param nums
     * @return
     */
    public int rob(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            dp[i] = Math.max(dp[i - 1], nums[i] + dp[i - 2]);
//            System.out.println(com.github.songjiang951130.leetcode.dp[i] + " " + com.github.songjiang951130.leetcode.dp[i - 1] + " " + (nums[i] + com.github.songjiang951130.leetcode.dp[i - 2]));
        }
        return dp[dp.length - 1];
    }

    public int rob(int[] nums, int start, int end) {
        int[] dp = new int[end - start + 1];
        dp[start] = nums[start];
        dp[start + 1] = Math.max(nums[start], nums[start + 1]);
        for (int i = start + 2; i < end; i++) {
            dp[i] = Math.max(dp[i - 1], nums[i] + dp[i - 2]);
        }
        return dp[end - 1];
    }

    /**
     * @link https://leetcode.com/problems/house-robber-ii/
     * 环形抢劫
     * 思路：在rob基础上可以分为两个问题
     * 1、如果rob 1st ，那么 最后一家不能抢劫
     * 2、如果 not rob 1st ，那么 算上最后一家
     * 在这两个结果里面去最大的
     */
    public int robCircle(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }
        if (nums.length == 3) {
            return Math.max(nums[2], Math.max(nums[0], nums[1]));
        }
        return Math.max(this.rob(nums, 0, nums.length - 1), this.rob(nums, 1, nums.length));
    }

}

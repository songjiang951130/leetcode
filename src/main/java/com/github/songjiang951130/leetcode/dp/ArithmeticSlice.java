package com.github.songjiang951130.leetcode.dp;

public class ArithmeticSlice {
    //求 等差数列（3个元素及以上）的 数量

    /**
     * 计算公式
     * len 为等差数列长度
     * sum = (len-1) *(len -2)/2
     * @result Runtime: 2 ms, faster than 10.22% of Java online submissions for Arithmetic Slices.
     * Memory Usage: 36.9 MB, less than 99.19% of Java online submissions for Arithmetic Slices.
     *
     * @param A
     * @return
     * @link https://leetcode.com/problems/arithmetic-slices/
     */
    public int numberOfArithmeticSlices(int[] A) {
        if (A.length < 2) {
            return 0;
        }
        System.out.println();
        int[] dp = new int[A.length];
        dp[0] = Integer.MAX_VALUE;
        int len = 1;
        int sum = 0;
        for (int i = 1; i < A.length; i++) {
            dp[i] = A[i] - A[i - 1];
            if (dp[i] == dp[i - 1]) {
                len++;
            }

            if (len >= 2 && (dp[i] != dp[i - 1] || i == A.length - 1)) {
                len = len + 1;
                int current = (len - 1) * (len - 2) / 2;
                sum += current;
                len = 1;
            }
        }
        return sum;
    }
}

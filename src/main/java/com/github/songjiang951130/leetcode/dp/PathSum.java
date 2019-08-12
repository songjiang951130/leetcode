package com.github.songjiang951130.leetcode.dp;

public class PathSum {

    /**
     * 当前时间 19-06-10 20:24
     * <p>
     * Runtime: 3 ms, faster than 91.95% of Java online submissions for Minimum Falling Path Sum.
     * Memory Usage: 37.5 MB, less than 96.67% of Java online submissions for Minimum Falling Path Sum.
     * </p>
     * leetcode 上有直接在原数组的基础上进行dp的
     *
     * @param A
     * @return
     */
    public int minFallingPathSum(int[][] A) {
        int[][] dp = new int[A.length][A[0].length];
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                //init com.github.songjiang951130.leetcode.dp
                if (i == 0) {
                    dp[0][j] = A[0][j];
                    continue;
                }
                //起始列判断
                if (j == 0) {
                    dp[i][j] = Math.min(dp[i - 1][j], dp[i - 1][j + 1]) + A[i][j];
                    continue;
                }
                //最后列判断
                if (j == A[i].length - 1) {
                    dp[i][j] = Math.min(dp[i - 1][j], dp[i - 1][j - 1]) + A[i][j];
                    continue;
                }
                dp[i][j] = Math.min(Math.min(dp[i - 1][j], dp[i - 1][j - 1]), dp[i - 1][j + 1]) + A[i][j];

            }
        }
        for (int lastRow = 0; lastRow < A[A.length - 1].length; lastRow++) {
            min = Math.min(dp[A.length - 1][lastRow], min);
        }
        return min;
    }
}

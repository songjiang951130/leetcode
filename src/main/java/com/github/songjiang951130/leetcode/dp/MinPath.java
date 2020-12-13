package com.github.songjiang951130.leetcode.dp;

/**
 * 最小路径
 */
public class MinPath {
    /**
     * 当前最优解等于 当前值 + 上方和左方之间较小值
     * grid[i][j] += Math.min(grid[i - 1][j], grid[i][j - 1]);
     * @param grid
     * @return
     */
    public int minPathSum(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (i == 0 && j == 0) {
                    continue;
                }
                if (i == 0) {
                    grid[i][j] += grid[i][j - 1];
                    continue;
                }

                if (j == 0) {
                    grid[i][j] += grid[i - 1][j];
                    continue;
                }
                grid[i][j] += Math.min(grid[i - 1][j], grid[i][j - 1]);
            }
        }
        return grid[grid.length - 1][grid[0].length - 1];
    }
}

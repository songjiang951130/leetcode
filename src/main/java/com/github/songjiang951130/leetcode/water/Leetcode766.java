package com.github.songjiang951130.leetcode.water;

public class Leetcode766 {

    /**
     * [36,59,71,15,26,82,87]
     * [56,36,59,71,15,26,82]
     * [15,00,36,59,71,15,26]
     * 斜对角线相等
     * @param matrix
     * @return
     */
    public boolean isToeplitzMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = 0; j < matrix[i].length - 1; j++) {
                if (matrix[i][j] != matrix[i + 1][j + 1]) {
                    return false;
                }
            }

        }
        return true;
    }
}

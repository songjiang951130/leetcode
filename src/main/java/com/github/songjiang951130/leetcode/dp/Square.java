package com.github.songjiang951130.leetcode.dp;

public class Square {

    /**
     * @todo case5 未通过
     * @param matrix
     * @return
     */
    public int maximalSquare(char[][] matrix) {
        int len = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] != '1') {
                    continue;
                }
                len = Math.max(1, len);
                int k = 0;
                while (tryLen(matrix, i, j, k)) {
                    k++;
                    len = Math.max(k, len);
                }
            }
        }
        return len * len;
    }

    /**
     * 尝试该处 长为len的外圈是否可行
     *
     * @param matrix
     * @param i
     * @param j
     * @param len
     * @return
     */
    private boolean tryLen(char[][] matrix, int i, int j, int len) {
        if (i + len >= matrix.length - 1 || i + len >= matrix[i].length - 1) {
            return false;
        }

        if (j + len >= matrix[i].length - 1 || j + len >= matrix.length - 1) {
            return false;
        }

        for (int m = i; m < i + len; m++) {
            System.out.println(m + " " + i + " " + j + " " + len);
            if (matrix[i + len][j + m] != '1') {
                return false;
            }
            System.out.println(4);
            if (matrix[i + m][j + len] != '1') {
                return false;
            }
        }
        return true;
    }
}

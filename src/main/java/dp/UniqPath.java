package dp;

public class UniqPath {

    /**
     * 动态规划
     * @link https://leetcode.com/problems/unique-paths
     * @param m
     * @param n
     * @return
     */
    public int uniquePaths(int m, int n) {
        int[][] array = new int[m][n];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == 0 || j == 0) {
                    array[i][j] = 1;
                } else {
                    array[i][j] = array[i][j - 1] + array[i - 1][j];
                }
            }
        }
        return array[m - 1][n - 1];
    }
}
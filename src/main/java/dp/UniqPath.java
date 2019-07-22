package dp;

public class UniqPath {

    /**
     * 动态规划
     *
     * @param m
     * @param n
     * @return
     * @link https://leetcode.com/problems/unique-paths
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

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int[][] array = new int[obstacleGrid.length][obstacleGrid[0].length];
        for (int i = 0; i < obstacleGrid.length; i++) {
            for (int j = 0; j < obstacleGrid[i].length; j++) {
                if (obstacleGrid[i][j] == 0) {
                    if (i == 0 && j == 0) {
                        array[i][j] = 1;
                        continue;
                    }
                    // 设置第一行
                    if (i == 0) {
                        array[0][j] = obstacleGrid[0][j - 1] == 1 ? 0 : array[0][j - 1];
                        continue;
                    }
                    // 设置第一列
                    if (j == 0) {
                        array[i][0] = obstacleGrid[i - 1][0] == 1 ? 0 : array[i - 1][0];
                        continue;
                    }
                    int left = array[i][j - 1];
                    if (obstacleGrid[i][j - 1] == 1) {
                        left = 0;
                    }
                    int right = array[i - 1][j];
                    if (obstacleGrid[i - 1][j] == 1) {
                        right = 0;
                    }
                    array[i][j] = left + right;
                }
            }
        }
        return array[obstacleGrid.length - 1][obstacleGrid[0].length - 1];
    }

    /**
     * 从 1 走到 2 ，-1 代表障碍
     * exmaple：
     * 1 0 0  0
     * 0,0,0, 0
     * 0,0,2,-1
     * @todo 提示回溯法解决
     */
    public int uniquePathsIII(int[][] grid) {
        return 0;
    }
}
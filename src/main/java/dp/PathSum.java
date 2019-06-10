package dp;

public class PathSum {

    public int minFallingPathSum(int[][] A) {
        int[][] dp = new int[A.length][A[0].length];
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                if (i == 0) {
                    dp[0][j] = A[0][j];
                    continue;
                }
                if (j == 0) {
                    dp[i][j] = Math.min(dp[i - 1][j], dp[i - 1][j + 1]) + A[i][j];
                    if (i == A.length - 1) {
                        min = Math.min(dp[i][j], min);
                    }
                    continue;
                }

                if (j == A[i].length - 1) {
                    dp[i][j] = Math.min(dp[i - 1][j], dp[i - 1][j - 1]) + A[i][j];
                    if (i == A.length - 1) {
                        min = Math.min(dp[i][j], min);
                    }
                    continue;
                }
                dp[i][j] = Math.min(Math.min(dp[i - 1][j], dp[i - 1][j - 1]), dp[i - 1][j + 1]) + A[i][j];
                if (i == A.length - 1) {
                    min = Math.min(dp[i][j], min);
                }
            }

        }
        return min;
    }
}

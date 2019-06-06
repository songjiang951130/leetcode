package dp;

public class EasyDp {

    //1,2,3,1

    /**
     * 思路：计算dp[i] 当前的最大值，依赖的是 dp[i-1],nums[i]+dp[i-2]中的最大值
     * <p>
     * 特别注意，dp[1] = max(nums[0],nums[1])
     *
     * @param nums
     * @return
     */
    public int rob(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return  nums[0];
        }
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            dp[i] = Math.max(dp[i - 1], nums[i] + dp[i - 2]);
//            System.out.println(dp[i] + " " + dp[i - 1] + " " + (nums[i] + dp[i - 2]));
        }
        return dp[dp.length - 1];
    }

    /**
     * @link https://leetcode.com/problems/house-robber-ii/
     */


}

package dp;

public class EasyDp {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = nums[1];
        for (int i = 2; i < nums.length-1; i+=2) {
           dp[i] += Math.max(nums[i+1],nums[i+2]);
        }
        return Math.max(dp[dp.length-2],dp[dp.length-3]);
    }

}

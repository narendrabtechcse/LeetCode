class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int num:nums)
            sum += num;
        if(sum%2!=0)
            return false;

        boolean dp[][] = new boolean[nums.length+1][sum/2+1];
        dp[0][0] = true;

        boolean isPossible = canPartition1(nums,nums.length,sum/2,dp);
        return  isPossible;
    }

    private boolean canPartition1(int[] nums, int n, int sum , boolean[][] dp) {
        if(dp[n][sum] == true )
            return dp[n][sum];

        for (int i=1;i<=n;i++)
        {
            dp[i][0] = true;
        }

        for (int i = 1; i <= nums.length; i++) {
            if(i==0)
                dp[i][sum]=false;
            for (int j = 1; j <= sum; j++) {
                if (nums[i - 1] <= j) {
                     dp[i][j] = dp[i - 1][ j - nums[i - 1]] || dp[i-1][ j];
                } else {
                     dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[n][sum];
    }
}
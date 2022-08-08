class Solution {
    int dp[];
    public int lengthOfLIS(int[] arr) {
        int n = arr.length;
        dp = new int[n];
        int max=0;
        
        for(int i=0;i<n;i++)
            {
                dp[i]=1;
            }
        
        for(int i=1;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(arr[i]>arr[j] && dp[i]<dp[j]+1)
                {
                    dp[i] = dp[j]+1;
                }
            }  
        }
        
         for(int i=0;i<n;i++)
            {
                max = Math.max(max,dp[i]);
            }
        
        return max;
    }
}
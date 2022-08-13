class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        
        int n1 = text1.length();
        int n2 = text2.length();
        
        int[][] dp = new int[n1+1][n2+1];
        
        for(int col=n2-1;col>=0;col--)
        {
            for(int row=n1-1;row>=0;row--)
            {
                if(text1.charAt(row)== text2.charAt(col))
                {
                    dp[row][col] = 1 + dp[row+1][col+1];
                }else{
                    dp[row][col] = Math.max(dp[row+1][col],dp[row][col+1]);
                }
            }
        }
        
        return dp[0][0];
        
    }
}
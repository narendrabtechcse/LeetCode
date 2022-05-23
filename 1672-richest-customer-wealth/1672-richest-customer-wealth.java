class Solution {
    public int maximumWealth(int[][] accounts) {
        int max_sum=0;
        for(int i=0;i<accounts.length;i++)
        {
            int localSum=0;
            for(int j=0;j<accounts[i].length;j++)
            {
                localSum = localSum+ accounts[i][j];
            }
            max_sum = Math.max(max_sum,localSum);
        }
        
        return max_sum;
    }
}
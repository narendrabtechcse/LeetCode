class Solution {
    public int maxProfit(int[] prices) {
        
        int minVal = prices[0];
        int maxVal = 0;
        
        
        for(int i=0;i<prices.length;i++)
        {
            maxVal = Math.max(maxVal,prices[i]-minVal);
            minVal = Math.min(minVal,prices[i]);
        }
        return maxVal;
    }
}
class Solution {
    public int maxProfit(int[] prices) {
        
        //[7,1,5,3,6,4]
        
        int minVal = prices[0];
        int maxVal = 0;
        
        for(int i=1;i<prices.length;i++)
        {
            maxVal = Math.max(maxVal,prices[i]-minVal);
            minVal = Math.min(minVal,prices[i]);
        }
        
        return maxVal;
        
    }
}
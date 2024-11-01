class Solution {
    public int maxSubArray(int[] nums) {
        
        int maxVal = Integer.MIN_VALUE;
        int currentSum = 0;
        
        
        for(int num : nums)
        {
            currentSum += num;
            maxVal = Math.max(maxVal,currentSum);
            
            
            if(currentSum<0)
                currentSum=0;

        }
        return maxVal;
    }
}
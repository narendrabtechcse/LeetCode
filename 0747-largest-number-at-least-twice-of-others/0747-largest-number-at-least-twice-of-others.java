class Solution {
    public int dominantIndex(int[] nums) {
        int max=0;
        int maxIndex = 0;
        for(int i = 0;i<nums.length;i++)
        {
            if(nums[i]>max)
            {
                max = nums[i];
                maxIndex = i;    
            }
            
        }
        
        for(int j = 0;j<nums.length;j++)
        {
            if(j!=maxIndex && nums[j]*2 > max)
                return -1;
        }
        
        return maxIndex;
        
    }
}
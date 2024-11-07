class Solution {
    public int pivotIndex(int[] nums) {
        
        int leftSum=0;
        int rightSum=0;
        int totalSum =0;
        
        for(int i=0;i<nums.length;i++)
        {
            totalSum = totalSum + nums[i];
        }
        
        rightSum = totalSum;
        
        for(int i=0;i<nums.length;i++)
        {
             rightSum = rightSum-nums[i];
            
             if((leftSum-rightSum)==0)
                return i;
            
            leftSum = leftSum+ nums[i];
        }
        
        return -1;
        
    }
}
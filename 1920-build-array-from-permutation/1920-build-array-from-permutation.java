class Solution {
    
    public int[] buildArray(int[] nums) {
        
        int[] outputArr = new int[nums.length];
        
        for(int i=0;i<nums.length;i++)
        {
            outputArr[i] = nums[nums[i]];
        }
        
        return outputArr;
        
    }
}
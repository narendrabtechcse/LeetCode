class Solution {
    public void moveZeroes(int[] nums) {
        
        int m=0;
        
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                nums[m++] = nums[i];
            }
        }
        
        for(int j=m;j<nums.length;j++)
        {
            nums[j]=0;
        }
        
       
    }
}
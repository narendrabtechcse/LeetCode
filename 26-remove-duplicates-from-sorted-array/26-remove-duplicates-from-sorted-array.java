class Solution {
    public int removeDuplicates(int[] nums) {
            int m=0;
           if (nums.length == 0) return 0;
        
            for(int i=1;i<nums.length;i++)
            {
                if(nums[i]!=nums[m])
                {
                    m++;
                    nums[m]=nums[i];
                }
            }
            return m+1;
        }
}
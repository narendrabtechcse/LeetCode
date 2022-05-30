class Solution {
    public int numIdenticalPairs(int[] nums) {
        int size = nums.length;
        int count = 0;
        for(int i=0;i<size;i++)
        {
            for(int j=i+1;j<size;j++)
            {
                if(nums[i]==nums[j])
                    count++;
            }
        }
        return count;
    }
}
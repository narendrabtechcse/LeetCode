class Solution {
    public int jump(int[] nums) {

        int totalJumps = 0;
        int destination = nums.length-1;
        int coverage=0;
        int lastJumpIdx = 0;
        
        //Base case 
        if(nums.length == 1)
            return 0;
        
        for(int i=0;i<destination;i++)
        {
            coverage = Math.max(coverage,i+nums[i]);
            
            if(i==lastJumpIdx)
            {
                lastJumpIdx = coverage;
                totalJumps++;
                
                if(coverage>=destination)
                    return totalJumps;
            }
        }
        
        return totalJumps;
        
    }
}
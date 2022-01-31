class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int local1s=0;
        int global1s=0;
        for(int n:nums)
        {
            if(n==1){
                local1s++;
                if(local1s>global1s)
                    global1s=local1s;
            }
            else
            {
                local1s=0;
            }
        }
        
        return global1s;
        
    }
}
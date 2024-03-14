class Solution {
    public int dominantIndex(int[] nums) {
        
        int maxNum = 0;
        int secondMax = 0;
        int index =0;
        int i =0;
        
        for(int num : nums)
        {
            
            if(num>maxNum)
            {
                secondMax = maxNum;
                maxNum = num;
                index = i;
            }else{
                if(num>secondMax)
                    secondMax = num;
            }
            
            i++;
        }
        return maxNum>=secondMax*2 ? index : -1;
    }
}
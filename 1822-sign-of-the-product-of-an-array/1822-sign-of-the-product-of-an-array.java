class Solution {
    int negNums=0;
    boolean isZero=false;
    public int arraySign(int[] nums) {
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0){
                isZero = true;
            return 0;
            }else if(nums[i]<0)
            {
               negNums++; 
            }
        }
        if(negNums%2==1)
            return -1;
        else
            return 1;
    }
}
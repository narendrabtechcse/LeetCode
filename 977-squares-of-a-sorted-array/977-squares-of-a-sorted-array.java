class Solution {
    public int[] sortedSquares(int[] nums) {
        int start=0;
        int end = nums.length-1;
        int[] outPutArr = new int[end+1];
        int output = end;
        while(start<=end)
        {
            if(nums[start]*nums[start]>=nums[end]*nums[end])
            {
                outPutArr[output--] = nums[start]*nums[start];
                start++;
            }else{
                outPutArr[output--] = nums[end]*nums[end];
                end--;
            }
        }
        
        return outPutArr;
    }
}
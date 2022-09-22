class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        
        int evenSum=0;
        int[] outPutArr = new int[nums.length];
        
        for(int num : nums)
        {
            if(num%2==0)
                evenSum = evenSum + num;
        }
        
        for(int i=0;i<queries.length;i++)
        {
            int val = queries[i][0];
            int index = queries[i][1];
            
            if(nums[index]%2==0)
            evenSum=evenSum-nums[index];
            
            nums[index] = nums[index]+val;
            
            if(nums[index]%2==0){
                evenSum=evenSum+nums[index];
                outPutArr[i] =  evenSum;
                }else{
                outPutArr[i] =  evenSum;
            }
        }
        return outPutArr;
    }
}
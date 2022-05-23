class Solution {
    int sum=0;
    public int[] runningSum(int[] nums) {
        int[] outputArr = new int[nums.length];
        for(int i=0;i<nums.length;i++){
        sum = sum + nums[i];
        outputArr[i] = sum;
        }
        return outputArr;
    }
}
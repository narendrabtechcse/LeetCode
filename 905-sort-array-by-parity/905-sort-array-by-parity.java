class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int start=0;
        int end = nums.length-1;
        
        while(start<end){
        if(nums[start]%2==0)
        {
            start++;
        }else{
            if(nums[end]%2==1)
            {
                end--;
            }else{
                int temp=nums[end];
                nums[end]=nums[start];
                nums[start] = temp;
                start++;
                end--;
            }
        }
    }
        
        return nums;
        
    }
}
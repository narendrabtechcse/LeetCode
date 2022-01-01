class Solution {
    public int search(int[] nums, int target) {
        
        int start = 0;
        int end = nums.length-1;
        int index = binarySearch(nums, start , end,target);
        return index;
    }
    
    public int binarySearch(int[] arr, int start , int end,int target)
    {
        
        while(start<=end)
        {
            
            int mid = start+(end-start)/2;
            
            if(arr[mid]==target)
                return mid;
            
            if(target>arr[mid])
            {
                start=mid+1;
            }else{
                end = mid-1;
            }
            
        }
        
        return -1;
    }
}
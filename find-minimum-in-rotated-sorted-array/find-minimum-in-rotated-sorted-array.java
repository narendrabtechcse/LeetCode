class Solution {
    public int findMin(int[] nums) {
        
        int start = 0;
        int end = nums.length-1;
        int index = binarySearchFindMin(nums, start , end);
        return nums[index];    
        
    }
    
    //iterative solution
    
    public int binarySearchFindMin(int[] arr, int start , int end)
    {
        
        while(start<=end)
        {
            
            int mid = start+(end-start)/2;
            
            if(arr.length == 1 )
                return 0;
            
            if(mid==0 && arr[mid+1]<arr[mid])
                return mid+1;
            else if(mid==0 && arr[mid+1]>arr[mid])
                return mid;
                
            
            
             if(mid>0 && arr[mid]<arr[mid-1])
                return mid;
            
            if(arr[mid]>arr[end])
            {
                start=mid+1;
            }else{
                end = mid;
            }
            
        }
        
        return -1;
        
    }
    
    
    
    
}
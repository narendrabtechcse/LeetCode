class Solution {
    public int searchInsert(int[] nums, int target) {
        
        int start = 0;
        int end = nums.length;
        
        return search(nums,target,start,end);
        
    }
    
    public int search(int[] nums,int target,int startIndex,int endIndex)
    { 
       if (startIndex == endIndex){
			return startIndex;
		}
		
		int middle = (startIndex+endIndex)/2;
		
		if (target == nums[middle]){
		    return middle;
		}
		
		if (target<nums[middle]){
			return search(nums, target, startIndex, middle);
		}
		
		return search(nums, target, middle+1, endIndex);
	}
    
}
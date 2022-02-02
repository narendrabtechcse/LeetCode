class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<Integer>();
        for( int i=0;i< nums.length; i++){
            int index = nums[i];
            if(nums[Math.abs(index)-1] > 0){
                nums[Math.abs(index)-1]= -nums[Math.abs(index)-1];
            }
        }
        
        for(int j =1 ;j <= nums.length ; j++){
            if(nums[j-1] > 0){
                result.add(j);
            }
        }
        return result;
    }
}




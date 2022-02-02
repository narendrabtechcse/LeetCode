class Solution {
    public int thirdMax(int[] nums) {
        
        TreeSet<Integer> result =new TreeSet();
        for(int num: nums){
            result.add(num);
        }
        if(result.size()>=3){
            result.pollLast();
            result.pollLast();
        }
        return result.last();
    
        
    }
}
class Solution {
    
    Queue<Integer> minHeap = new PriorityQueue<Integer>();
    
    public int[] sortArray(int[] nums) {
        
        int[] outPutArr = new int[nums.length];
        
        for(int i=0;i<nums.length;i++)
            minHeap.add(nums[i]);
        
        
        for(int j=0;j<nums.length;j++)
            outPutArr[j] = minHeap.poll();
        
         return outPutArr;
    }
    
   
    
}
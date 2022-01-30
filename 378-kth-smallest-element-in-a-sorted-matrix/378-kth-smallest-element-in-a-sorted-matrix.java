class Solution {
    public int kthSmallest(int[][] nums, int k) {
        Queue<Integer> minHeap = new PriorityQueue<Integer>(Collections.reverseOrder());
        
        if(nums[0].length==1)
            return nums[0][0];
        
        int totalElement=0;
        
        for(int i=0; i<nums.length; i++) {
            for(int j=0; j<nums[i].length; j++) {
                minHeap.add(nums[i][j]);
                totalElement++;
            }
            
        }
        
        if(totalElement==k)
            return minHeap.poll();
        
        while(minHeap.size() > k) {
                minHeap.poll();
        }
        
        
        if(minHeap.size()>=1)
        return minHeap.poll();
        else
            return 0;
    }
}
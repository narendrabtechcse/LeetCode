class KthLargest {
    
    int k;
    PriorityQueue<Integer> heap;

    public KthLargest(int k, int[] nums) {
        this.k=k;
        heap = new PriorityQueue<Integer>();
        
        for(int i=0;i<nums.length;i++)
        {
            heap.offer(nums[i]);
        }
        
        while(heap.size()>k)
        {
            heap.poll();
        }
        
    }
    
    public int add(int val) {
        
        heap.offer(val);
        
        while(heap.size()>k)
            heap.poll();
        
        return heap.peek();
        
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */
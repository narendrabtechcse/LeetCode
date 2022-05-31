class Solution {
    public int maxProduct(int[] nums) {
        
        Queue<Integer> maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder());

        for(int i=0;i<nums.length;i++)
        {
            maxHeap.add(nums[i]);
        }
        
        int elem1 = maxHeap.poll();
        int elem2 = maxHeap.poll();
        
        return (elem1-1)*(elem2-1);
    }
}
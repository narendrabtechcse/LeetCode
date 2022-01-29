class Solution {
    public int lastStoneWeight(int[] stones) {
        
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int n : stones)
        {
            maxHeap.add(n);
        }
        
        while(maxHeap.size()>=2)
        {
            int elem1 = maxHeap.poll();
            int elem2 = maxHeap.poll();
            
            if(elem1>elem2)
            {
                maxHeap.add(elem1-elem2);
            }
        }
        if(maxHeap.size()==1)
        return maxHeap.poll();
        else
            return 0;
        
    }
}
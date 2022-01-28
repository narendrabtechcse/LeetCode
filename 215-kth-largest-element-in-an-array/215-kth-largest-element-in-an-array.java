class Solution {
    public int findKthLargest(int[] nums, int k) {

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < nums.length; i++) {
            maxHeap.add(nums[i]);
        }
        int removeElement=0;
        for (int i = 0; i < k; i++) {


            removeElement = maxHeap.poll();
        }
        return removeElement;
    }
}
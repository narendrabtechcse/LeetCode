class Solution {
    public int minSetSize(int[] arr) {
        int n = arr.length;
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<n;i++)
        {
            map.put(arr[i],map.getOrDefault(arr[i], 0)+1);
        }
        
        Queue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
        for(Integer value : map.values())
        {
            pq.add(value);
        }
        
        int sum=0,count = 0;
        for(int i=0;i<n;i++)
        {
           if(sum>=n/2 )
               break;
            else if(pq.size()>0) {
                sum = sum + pq.poll();
                count = count+1;
            }
        }
        return count;
    }
}
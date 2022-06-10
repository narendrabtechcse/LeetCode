class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        
            int[] ans = new int[Math.min(nums1.length , nums2.length)];
    Map<Integer, Integer> map = new HashMap(); 
    int k = 0;
    
    for(int n : nums1){
        if(map.containsKey(n)){
            map.put(n , map.get(n) + 1);
        }else{
            map.put(n , 1);
        }
    }
    
    for(int m : nums2){
        if(map.containsKey(m)){
            ans[k++] = m;
            if(map.get(m) > 1){
              map.put(m, map.get(m) - 1);  
            }else{
                map.remove(m);
            }
              
        }
    }
    int[] arr = new int[k];
    int l = 0;
    while(l < k){
        arr[l] = ans[l++] ;
    }
    return arr;
    

        
    }
}
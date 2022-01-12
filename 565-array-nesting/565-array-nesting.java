class Solution {
    public int arrayNesting(int[] nums) {
        
        boolean[] visited = new boolean[nums.length];
        
        int countGlobal = 0;
        Set set ;
        int j = 0;
        int countLocal = 0;
        for(int i=0;i<nums.length;i++){
            
            j=nums[i];
            countLocal = 0;
            if(!visited[i]){
            do{
                j=nums[j];
                visited[j] = true;
                countLocal++;
            }while (j != nums[i]);
                
            if(countLocal>countGlobal)
                countGlobal = countLocal;
        }
            }
        
        return countGlobal;
        
    }
}
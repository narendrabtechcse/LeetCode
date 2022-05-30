class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
         ArrayList<Boolean> ans =new ArrayList<Boolean>();
        int max=candies[0];
        for(int i=0;i<candies.length;i++){
            if(max<candies[i]){
                max=candies[i];
            }
        }
        for(int j=0;j<candies.length;j++){
            if(candies[j]+extraCandies >= max){
                ans.add(true);
            }
            else{
                ans.add(false);
            }
        }
        return ans;
        
        
        
    }
}
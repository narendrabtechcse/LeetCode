class Solution {
    public String[] findRelativeRanks(int[] score) {
        int s[] = new int[score.length];
        for(int i=0;i<score.length;i++){
            s[i] = score[i];
        }
        Arrays.sort(s);
        Map<Integer,Integer> m = new HashMap<>();
        int j=1;
        for(int i=s.length-1;i>=0;i--){
            m.put(s[i],j++);
        }
        String res[] = new String[score.length];

        for(int i=0;i<score.length;i++){
            if(m.get(score[i]) == 1){
                res[i] = "Gold Medal";
            }
            else if(m.get(score[i]) == 2){
                res[i] = "Silver Medal";
            }
            else if(m.get(score[i]) == 3){
                res[i] = "Bronze Medal";
            }
            else{
                res[i] = ""+m.get(score[i]);
            }
        }
        return res;
    }
}
class Solution {
    public String sortSentence(String s) {
        
         String[] arr= s.split(" "), res= new String[arr.length];
        for(String w:arr){
            int k= w.length(), pos= Integer.valueOf(w.substring(k-1))-1;
            res[pos]= w.substring(0, k-1);
        }
        return String.join(" ", res);
        
    }
}
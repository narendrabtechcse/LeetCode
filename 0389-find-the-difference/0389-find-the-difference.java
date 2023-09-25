class Solution {
    public char findTheDifference(String s, String t) {
       int[] arr = new int[26];
        
        for(char c: s.toCharArray()){
            arr[c-'a']++;
        }
        for(char c: t.toCharArray()){
            arr[c-'a']--;
        }
        for(int i=0;i<26;i++){
            if(arr[i]<0){
                return (char)(i+'a');
            }
        }
        return '0'; 
    }
}
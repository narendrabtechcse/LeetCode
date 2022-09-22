class Solution {
    public String reverseWords(String s) {
        
        String[] words = s.split(" ");
        
        StringBuffer outPutArr = new StringBuffer();
        int i = 0;
        for(String word : words){
            outPutArr.append(new StringBuffer(word).reverse());
    
            if(i!=words.length-1)
             outPutArr.append(" ");
            i++;
        }
        return outPutArr.toString();
    }
}
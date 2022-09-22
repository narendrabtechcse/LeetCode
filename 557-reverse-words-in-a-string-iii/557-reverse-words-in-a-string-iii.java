class Solution {
    public String reverseWords(String s) {    
        StringBuffer outPutArr = new StringBuffer();
        int i = 0;
        for(String word : s.split(" ")){
            outPutArr.append(new StringBuffer(word).reverse());
            if(i!=s.split(" ").length-1)
             outPutArr.append(" ");
             i++;
        }
        return outPutArr.toString();
    }
}
class Solution {
    public String truncateSentence(String s, int k) {
        String[] str = s.split(" ");
        String finalStr="";
        for(int i=0;i<k;i++)
        {
            finalStr = finalStr + str[i];
            if(i!=k-1)
                finalStr = finalStr+ " ";
        }
        
        return finalStr;
    }
}
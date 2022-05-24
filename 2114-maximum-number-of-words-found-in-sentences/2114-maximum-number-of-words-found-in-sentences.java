class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxLength = 0;
        for(int i=0;i<sentences.length;i++)
        {
            String[] newStr = sentences[i].split(" ");
            maxLength = Math.max(maxLength, newStr.length);
        }
        return maxLength;
    }
}
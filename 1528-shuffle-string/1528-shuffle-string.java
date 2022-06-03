class Solution {
    public String restoreString(String s, int[] indices) {
        
        char[] outputStr = new char[s.length()];
        
        for(int i=0;i<s.length();i++)
        {
            outputStr[indices[i]] = s.charAt(i);
        }
        
         String string = new String(outputStr);
        
        return string;
    }
}
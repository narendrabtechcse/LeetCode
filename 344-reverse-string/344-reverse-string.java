class Solution {
    public void reverseString(char[] s) {
        helper(s,0,s.length-1);
    }
    
    public void helper(char[] s, int start, int end)
    {
        if(start>=end || start<0 || end>s.length-1) return;
        else{
        char temp;
        temp=s[end];
        s[end]=s[start];
        s[start]=temp;
        helper(s,start+1,end-1);
        }
    }
}
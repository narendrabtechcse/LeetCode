class Solution {
    public int balancedStringSplit(String s) {
        int res = 0, cnt = 0;
        
        for (int i = 0; i < s.length(); i++) {
            cnt += s.charAt(i) == 'R' ? 1 : -1;
            
            if (cnt == 0) {
                res++;
            }
        }
        return res;  
    }
}
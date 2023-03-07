class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        
       if (s1.length() + s2.length() != s3.length()) return false;
        
        boolean[][] matched = new boolean[s1.length() + 1][s2.length() + 1];
        
        
        for (int i = s1.length(); i >= 0; i--) {
            for (int j = s2.length(); j >= 0; j--) {
                if (i == s1.length() && j == s2.length()) {
                    matched[i][j] = true;
                } else if (i < s1.length() && s1.charAt(i) == s3.charAt(i + j) && matched[i + 1][j]) {
                    matched[i][j] = true;
                } else {
                    matched[i][j] = (j < s2.length() && s2.charAt(j) == s3.charAt(i + j) && matched[i][j + 1]);
                }

            }
        }
        return matched[0][0];
        
    }
    
}
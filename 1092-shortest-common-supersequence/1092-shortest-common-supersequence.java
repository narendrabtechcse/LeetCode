class Solution {
    public String shortestCommonSupersequence(String str1, String str2) {
        
         int m = str1.length();
        int n =  str2.length();

        String lcs = all_longest_common_subsequences(str1,str2,m,n);
        return lcs;
    }

    public static String all_longest_common_subsequences(String s, String t, int m, int n)
    {
        /* filling up the 2-d array with the maximum possible length of all subsequences */
        int dp[][] = new int [m+1][n+1];

        for(int i=1; i<m+1; i++){
            for(int j=1; j<n+1; j++){

                if(s.charAt(i-1) == t.charAt(j-1)){

                    dp[i][j] =  1 + dp[i-1][j-1];
                }
                else{
                    dp[i][j] = Math.max(dp[i][j-1] , dp[i-1][j]);
                }
            }
        }

      /** traversing back the array and adding up all the characters where the maximum subsequnce was possible with lcs */

        StringBuilder str = new StringBuilder();

        int i = m, j = n;

          while(i>0 && j>0){
            if(s.charAt(i-1)==t.charAt(j-1)){
                str.append(s.charAt(i-1));
                i--;
                j--;
            }
            else if(dp[i-1][j]>dp[i][j-1]){
                str.append(s.charAt(i-1));
                i--;
            }
            else if(dp[i-1][j]<=dp[i][j-1]){
                str.append(t.charAt(j-1));
                j--;
            }
            
        }
/* after getting the lcs String now we add all the leftover character from string 1 and string 2 into the lcs string */

        while(i>0){
            str.append(s.charAt(i-1));
            i--;
        }
        while(j>0){
            str.append(t.charAt(j-1));
            j--;
        }

        return str.reverse().toString();
    }
    
}
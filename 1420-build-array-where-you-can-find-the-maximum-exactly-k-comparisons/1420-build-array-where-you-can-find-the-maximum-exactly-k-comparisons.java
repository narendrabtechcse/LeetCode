class Solution {
    public int numOfArrays(int n, int m, int l) {
        long[][][] dp = new long[n + 1][m + 1][l + 1];
        int mod = (int) Math.pow(10, 9) + 7, res = 0;
        for (int j = 1; j <= m; j++) dp[1][j][1] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                for (int k = 1; k <= l; k++) {
                    if (i == 1 && k == 1) continue;
                    long tmp = dp[i - 1][j][k] * j;
                    for (int c = 1; c < j; c++) tmp = tmp + dp[i - 1][c][k - 1];
                    dp[i][j][k] = tmp % mod;
                }
            }
        }
        for (int j = 1; j <= m; j++) res = (res + (int) dp[n][j][l]) % mod;
        return res;
    }
}
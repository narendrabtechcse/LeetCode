class Solution {
    public String decodeAtIndex(String S, int K) {
    K--;
    long L = 0;
    int i = 0;
    while(K >= L) {
        L = S.charAt(i) <= '9' ? L * (S.charAt(i) - '0') : L + 1;
        i++;
    }
    i--;
    while(K < L - 1 || S.charAt(i) <= '9') {
        if(S.charAt(i) <= '9') {
            L /= S.charAt(i) - '0';
            K %= L;
        } else {
            L--;
        }
        i--;
    }
    return S.substring(i, i + 1);
}
}
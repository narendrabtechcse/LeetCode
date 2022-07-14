class Solution {
    public boolean isPowerOfFour(int n) {
        int curEle = 4;
        if(n==1)
            return true;
        if(n<=0)
            return false;
        
        while(n>1){
            if(n % 4 != 0){
                return false;
            }
            n /= 4;
        }
        return true;
    }
}
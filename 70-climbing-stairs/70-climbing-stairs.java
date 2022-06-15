class Solution {
    public int climbStairs(int n) {
        int t[]=new int[n+1];
        Arrays.fill(t,-1);
        t[0]=0;
      return  solve(n,t);
        
        
    }
    int  solve(int n,int[] t){
        if(n<=0)return 0;
        if(n==1){
            return 1;
        }
        if(n==2)return 2;
        if(t[n]!=-1)return t[n];
       t[n]= solve(n-1,t)+solve(n-2,t);
        return t[n];
    }
}

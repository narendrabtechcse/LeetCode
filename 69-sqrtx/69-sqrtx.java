class Solution {
    public int mySqrt(int x) {
        
        int start = 2;
        int end = x/2;
        long num;
        
        if(x<2)
            return x;
        
        while(start<=end)
        {
           int mid = start + (end-start)/2;
             num = (long)mid * mid;
            
            if(num>x)
            {
                end=mid-1;
            }else if(num<x){
                start=mid+1;
            }else{
                return mid;
            }
            
        }
        
        return end;
        
    }
}
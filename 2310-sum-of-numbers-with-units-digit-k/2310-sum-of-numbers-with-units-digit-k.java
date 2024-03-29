class Solution {
    public int minimumNumbers(int num, int k) {
        
        if (num == 0)
            return 0;
        if (k == 0)
            return num % 10 == 0 ? 1 : -1;
        if (num % 10 == k) return 1;
        //max of result is 10, because if exist valid result, we must fint it in [1,10]
        //start with 1 and look for the target i that make unit k
        for (int i = 1; i <= num / k && i<=10; i++)
        {
            //if unit equal to k, we can pick any number in set to add the cap to num
            if (num % 10 == ((i * k) % 10)) // Look for equal unit's digit
                return i;
        }
        return -1;
	
	
        
        
    }
}
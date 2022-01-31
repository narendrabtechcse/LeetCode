class Solution {
    public int findNumbers(int[] nums) {
        
        int numOfDigits=0;
        
        for(int n : nums)
        {
            int numDigits = String.valueOf(n).length();
            if(numDigits%2==0)
                numOfDigits++;
        }
        
        return numOfDigits;
    }
}
class Solution {
     int x=0;
    public int finalValueAfterOperations(String[] operations) {
        
        
        for(int i=0; i < operations.length ; i++)
        {
            if(operations[i].equals("--X") || operations[i].equals("X--")){
                x=x-1;
            }
            else
            {
                x=x+1;
            }
        }
        
        return x;
        
    }
}
class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        if(matrix==null)
        {
            throw new IllegalArgumentException("Input matrix is null");
        }
        
        if(matrix.length==0 || matrix[0].length==0)
        {
            return new int[0];
        }
        
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        int[] result = new int[rows*cols];
        
        int r=0;
        int c=0;
        
        for(int i=0;i<result.length;i++)
        {
            result[i] = matrix[r][c];
            
            if((r+c)%2 == 0) //move up
            {
                
                if(c==cols-1)
                {
                    //reached last column , now move to below cell in the same column
                    r++;
                }else if(r==0)
                {
                    //reached first row now move to the next cell in the same row
                    c++;
                }else{
                    //somewhere in middle. Keep going up diagonally
                    r--;
                    c++;
                }
                
            }else{
                //move down
                if(r==rows-1)
                {
                    //Reached last row. Now move to next cell in same row.
                    //This condition needs to be checked first due to bottom left corner cell.
                    c++;
                }else if(c==0)
                {
                    //Reached first columns, now move to below cell in the same column.
                    r++;
                }else{
                    //Somewhere in the middle . Keep going down diagonally
                    r++;
                    c--;
                }
            }
        }
        return result;
    }
}
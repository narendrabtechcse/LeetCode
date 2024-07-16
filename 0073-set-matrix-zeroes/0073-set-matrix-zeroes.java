/*
IDEA:
    1st matrix loops:  To have a row array, and col array and to mark the row and col index to 1 when we find a 0.
    2nd matrix loops:  if that row OR col is a 1, we trun the matrix[][] position to 0
*/

class Solution {
    public void setZeroes(int[][] matrix) {
        //Mark the row and col that needs to be turned to 0
        int[] row = new int[matrix.length]; 
        int[] col = new int[matrix[0].length];
        
        //1st Loops to mark our arrays
        for(int i=0;i<matrix.length;i++)
            for(int j=0;j<matrix[0].length;j++)
                if(matrix[i][j]==0){
                    row[i]=1;
                    col[j]=1;
                }        
        
        //2nd loop to check if array row/col position is 1
        for(int i=0;i<matrix.length;i++)
            for(int j=0;j<matrix[0].length;j++)
                if(row[i]==1||col[j]==1)
                    matrix[i][j]=0;
                    
    }
}
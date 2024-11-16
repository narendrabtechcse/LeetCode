class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
    }
    
    
    private boolean solve(char[][] board)
    {
        for(int i=0;i<board.length;i++)
        {
            for(int j =0 ;j<board[0].length;j++)
            {
                if(board[i][j]=='.')
                {
                    for(char c='1'; c<='9'; c++){
                        
                         if(isSafe(board, i, j, c)){
                          
                             board[i][j] = c;
                             
                             if(solve(board)==true)
                                 return true;
                             else
                                 board[i][j] = '.';
                             
                         }
                        
                    }
                    return false;
                } 
            }
        }
        return true; // for fully filled board
    }
    
    private boolean isSafe(char[][] board, int row, int col, char c)
    {
        for(int i=0;i<9;i++)
        {
            if(board[i][col]==c)
                return false;
            
            if(board[row][i]==c)
                return false;
            
            
             if(board[3 * (row/3)  +  i/3][3 * (col/3)  +  i%3]   ==   c)  // checks within submatrix
                return false;
            
        }
        
        return true;
    }
}
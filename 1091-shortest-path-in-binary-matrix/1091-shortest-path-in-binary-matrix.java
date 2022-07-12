class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        
        if(grid[0][0]==1)
            return -1;
        
        int m = grid.length;
        int n = grid[0].length;
        
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{0,0,1});
        
        int[][] dirs = {{-1,0},{-1,1},{0,1},{1,1},{1,0},{1,-1},{0,-1},{-1,-1}};
        
        while(!q.isEmpty())
        {
           
            int size=q.size();
            while(size-->0)
            {
                int[] point = q.poll();
                
                 if(point[0]==m-1 && point[1]==n-1)
                return point[2];
                
                for(int[] dir:dirs)
                {
                int curX = point[0]+dir[0];
                int curY = point[1]+dir[1];
                    
                 if(curX>=0 && curY>=0 && curX<m && curY<n && grid[curX][curY]==0)
                 {
                     q.add(new int[] {curX,curY,point[2]+1});
                     grid[curX][curY]=1;
                 }
                    
                }
            }
        }
        
        return -1;
        
    }
}
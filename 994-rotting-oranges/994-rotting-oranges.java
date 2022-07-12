class Solution {
      public int orangesRotting(int[][] grid) {
        int[][] dirs = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        int count = 0;
        int count_fresh = 0;
        Queue<int[]> que = new LinkedList<>();
        
        // count fresh fruit and store location of rotten fruit in queue
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] == 1) {
                    count_fresh++;
                } else if(grid[i][j] == 2) {
                    que.offer(new int[]{i,j});
                }
            }
        }
        
        if(count_fresh == 0) return 0; // if there is no fresh fruit already, //return0
        
        // BFS 
        while(!que.isEmpty()) {
            count++;
            int size = que.size();
            for(int i = 0; i < size; i++) {
                int[] rot = que.poll();
                for(int[] dir : dirs) {
                    int x = rot[0] + dir[0];
                    int y = rot[1] + dir[1];

                    if(x < 0 || x > grid.length - 1 || y < 0 || y > grid[0].length - 1 || grid[x][y] == 0 || grid[x][y] == 2) continue;
                    grid[x][y] = 2;
                    que.offer(new int[]{x,y});
                    count_fresh--;
                } 
            }
        }
        
        return count_fresh == 0 ? count - 1 : -1;
    }
}
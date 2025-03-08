class Pair {
    int row,col;
    public Pair(int row,int col)
    {
        this.row=row;
        this.col=col;
    }
}

class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        int m = image.length;
        int n = image[0].length;

        Queue<Pair> q = new LinkedList<>();
        boolean[][] visited = new boolean[m][n];
        visited[sr][sc] = true;

        q.add(new Pair(sr,sc));

        while(!q.isEmpty())
        {
            Pair item = q.poll();
            int r = item.row;
            int c = item.col;

            if(image[r][c]==color)
            {
                q.poll();
                continue;
            }

            if(r>0)
            {
                if(image[r][c]==image[r-1][c] && !visited[r-1][c])
                {
                    visited[r-1][c]=true;
                    q.add(new Pair(r-1,c));
                }
            }

            if(r<m-1) {
                if(image[r][c] == image[r+1][c] && !visited[r+1][c]){
                    visited[r+1][c]=true;
                    q.add(new Pair(r+1,c));
                }
            }
            if(c>0){
                if(image[r][c-1] == image[r][c] && !visited[r][c-1]){
                    visited[r][c-1]=true;
                    q.add(new Pair(r,c-1));
                }
            }
            if(c<n-1){
                if(image[r][c+1] == image[r][c] && !visited[r][c+1]){
                    visited[r][c+1]=true;
                    q.add(new Pair(r,c+1));
                }
            }
            image[r][c] = color;
        }

        return image;
}
}
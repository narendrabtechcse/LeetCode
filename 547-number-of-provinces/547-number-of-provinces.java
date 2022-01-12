class Solution {
        private int[] root;
        private int[] rank;
    
    public int findCircleNum(int[][] isConnected) {
        root = new int[isConnected[0].length];
        rank = new int[isConnected[0].length];
        
        for (int i = 0; i < isConnected[0].length ;i++) {
            root[i] = i;
            rank[i] = 1; 
        }
        
        for(int i=0 ;i < isConnected[0].length;i++)
        {
            for(int j=0; j< isConnected[0].length;j++){
                if(isConnected[i][j]==1)
                    union(i,j);
            }
        }
        
        Set set = new HashSet();
        
        for (int i = 0; i < isConnected[0].length; i++) {
            set.add(find(i));
        }
        
        return set.size();
    }
    
    // The find function here is the same as that in the disjoint set with path compression.
    public int find(int x) {
        if (x == root[x]) {
            return x;
        }
        return root[x] = find(root[x]);
    }
    
    
    // The union function with union by rank
    public void union(int x, int y) {
        int rootX = find(x);
        int rootY = find(y);
        if (rootX != rootY) {
            if (rank[rootX] > rank[rootY]) {
                root[rootY] = rootX;
            } else if (rank[rootX] < rank[rootY]) {
                root[rootX] = rootY;
            } else {
                root[rootY] = rootX;
                rank[rootX] += 1;
            }
        }
    }
    
}
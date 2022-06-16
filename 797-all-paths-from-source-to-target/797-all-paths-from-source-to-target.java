class Solution {
    
    List<List<Integer>> paths = new ArrayList<>();
    
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        
        if(graph==null || graph.length==0)
            return paths;
        
        dfs(graph,0,new ArrayList<Integer>());
        
        return paths;
        
    }
    
    public void dfs(int[][] graph,int node , List<Integer> path)
    {
        path.add(node);
        
        if(node==graph.length-1)
        {
            paths.add(new ArrayList<>(path));
            return;
        }
        
        int[] nextNodes = graph[node];
        
        for(int nextNode:nextNodes)
        {
            dfs(graph,nextNode,path);
            path.remove(path.size()-1);
        }   
    }
}
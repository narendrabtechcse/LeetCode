class Solution {
    public List<String> findItinerary(List<List<String>> tickets) {
        
   Map<String,PriorityQueue<String>> graph = createGraph(tickets);

        List<String> path = new ArrayList<>();
        dfs(graph, path, "JFK");
        return path;
        
        
    }
    
    
     public void dfs(Map<String,PriorityQueue<String>> graph, List<String> path, String city) {
        while(graph.get(city) != null && !graph.get(city).isEmpty()) {
            String curr = graph.get(city).poll();
            dfs(graph, path, curr);
        }
        path.add(0,city);
    }
    
    
    private Map<String,PriorityQueue<String>> createGraph(List<List<String>> tickets)     {
        Map<String,PriorityQueue<String>> graph = new HashMap<>();
        for(List<String> ticket : tickets) {
            if(graph.get(ticket.get(0)) == null) {
                graph.put(ticket.get(0), new PriorityQueue<>());
            }
            graph.get(ticket.get(0)).add(ticket.get(1));
        }
        return graph;
    }
}
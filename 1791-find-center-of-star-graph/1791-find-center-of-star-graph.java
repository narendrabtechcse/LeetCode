class Solution {
    public int findCenter(int[][] edges) {
        int n = edges.length;
        List<List<Integer>> list = createGraph(edges);
        for (int i = 0;i < list.size(); i++) {
            if (list.get(i).size() ==n) return i;
        }
        
        return -1;
    }
    
    public List<List<Integer>> createGraph (int[][] edges) {
        List<List<Integer>> list = new ArrayList<>();
        
        for (int i = 0; i <= edges.length+1; i++) {
            list.add(new ArrayList<>());
        }
        
        for (int[] item : edges) {
            list.get(item[0]).add(item[1]);
            list.get(item[1]).add(item[0]);
        }
        
        return list;
    }
}
class Solution {
    private ArrayList < Integer > [] adjList;
    boolean[] isVisited;

    public boolean validPath(int n, int[][] edges, int start, int end) {
        adjList = new ArrayList[n];
        isVisited = new boolean[n];

        ArrayList < Integer > pathList = new ArrayList < > ();
        pathList.add(start);

        for (int i = 0; i < n; i++) {
            adjList[i] = new ArrayList < > ();
        }

        for (int[] edge: edges) {
            adjList[edge[0]].add(edge[1]);
            adjList[edge[1]].add(edge[0]);
        }

        return printAllPathsHelper(start, end, isVisited, pathList);
    }

    public boolean printAllPathsHelper(int start, int end, boolean[] isVisited, List < Integer > tempPathList) {
        Stack < Integer > stack = new Stack < > ();
        stack.push(start);
        isVisited[start] = true;

        while (!stack.isEmpty()) {
            Integer currentNode = stack.pop();
            isVisited[currentNode] = true;

            if (currentNode == end)
                return true;

            for (Integer node_exec: adjList[currentNode]) {
                if (!isVisited[node_exec]) {
                    stack.push(node_exec);
                    isVisited[node_exec] = true;
                }

            }

        }

        return false;
    }
}
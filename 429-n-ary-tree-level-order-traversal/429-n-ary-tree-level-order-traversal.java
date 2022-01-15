/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        
        
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        List<List<Integer>> result = new LinkedList<>();
        
        if(root == null){
            return result;
        }

        while(!queue.isEmpty())
        {
            List<Integer> levelList = new LinkedList<>();

            int qSize = queue.size();

            for(int i=1;i<=qSize;i++) {
                 Node presentNode = queue.poll();

                levelList.add(presentNode.val);

                for(Node child : presentNode.children){
                if (child!= null)
                    queue.offer(child);
                }
            }

            result.add(levelList);
        }

        return result;
        
        
    }
}
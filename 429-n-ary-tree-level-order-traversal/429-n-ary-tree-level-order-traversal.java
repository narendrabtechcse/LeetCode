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
    
    List<List<Integer>> list_final = new ArrayList<>();
    public List<List<Integer>> levelOrder(Node root) {
        
        if(root==null)
            return list_final;
        
        Queue<Node> queue = new LinkedList<Node>();
        
        queue.offer(root);
        
        while(!queue.isEmpty())
        {
            int q_size = queue.size();
            List<Integer> list = new ArrayList<Integer>();
            for(int i=0;i<q_size;i++){
            
            Node presentNode = queue.poll();
            list.add(presentNode.val);
            
            for(int j=0;j<presentNode.children.size();j++)
            {
                queue.offer(presentNode.children.get(j));
            }
                
            }
            list_final.add(list);
        }
        
        return list_final;
        
    }
}
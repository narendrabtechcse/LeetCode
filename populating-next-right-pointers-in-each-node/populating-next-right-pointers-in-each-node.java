/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

       // List<String> result = new LinkedList<>();
        
        if(root == null){
            return null;
        }

        while(!queue.isEmpty())
        {
            int qSize = queue.size();
            Node presentNode = null;
            for(int i=1;i<=qSize;i++) {
                
                if(i==1){
                    //TreeNode previousNode=null;
                  presentNode = queue.poll();
                    
                    }else{
                    Node previousNode = presentNode;
                    presentNode = queue.poll();
                    previousNode.next = presentNode;
                }
                
                

               //result.add(presentNode);

                if (presentNode.left != null)
                    queue.offer(presentNode.left);
                 if (presentNode.right != null)
                    queue.offer(presentNode.right);
            }

            presentNode.next  = null;
        }

        return root;
        
        
        
    }
}
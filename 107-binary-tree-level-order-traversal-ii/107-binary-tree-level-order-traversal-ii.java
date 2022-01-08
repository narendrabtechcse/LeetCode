/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    
    List<List<Integer>> result = new LinkedList<>();
    
    public List<List<Integer>> levelOrderBottom(TreeNode root) {        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int level =0;
        
        if(root == null){
            return result;
        }

        Stack<List<Integer>> stack = new Stack<List<Integer>>();
        
        while(!queue.isEmpty())
        {
            List<Integer> list = new LinkedList<>();
            int qSize = queue.size();
            level++;
            for(int i=1;i<=qSize;i++) {
                
                 TreeNode presentNode = queue.poll();
                    list.add(presentNode.val);
                
                if (presentNode.left != null)
                    queue.offer(presentNode.left);
                 if (presentNode.right != null)
                    queue.offer(presentNode.right);
            }
            stack.push(list);
            
            list = null;
        }
        
        for(int i=0;i<level;i++)
        {
            List<Integer> list1 = stack.pop();
            result.add(list1);
        }
            
        
         return result;
    }
   
}
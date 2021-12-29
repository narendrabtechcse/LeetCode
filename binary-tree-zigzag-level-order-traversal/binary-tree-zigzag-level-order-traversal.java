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
    
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        
        if(root == null){
            return result;
        }

        int level = 0;
        
        while(!queue.isEmpty())
        {
            double sum = 0;
            
            level++;

            int qSize = queue.size();
            
            Stack<Integer> stack = new Stack<Integer>();
            List<Integer> list = new LinkedList<>();

            for(int i=1;i<=qSize;i++) {
                
                 TreeNode presentNode = queue.poll();

                if(level%2==1){
                    list.add(presentNode.val);
                }else{
                    stack.push(presentNode.val);
                }
                
                if (presentNode.left != null)
                    queue.offer(presentNode.left);
                 if (presentNode.right != null)
                    queue.offer(presentNode.right);
            }
            
            while(!stack.isEmpty())
                list.add(stack.pop());

            result.add(list);
        }

        return result;
        
        
    }
}
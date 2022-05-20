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
    public List<Integer> rightSideView(TreeNode root) {
        
        List<Integer> finalList = new ArrayList<Integer>();
        
        if(root==null)
            return finalList;
        
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        
        queue.offer(root);
        
        while(!queue.isEmpty())
        {
            int qSize = queue.size();
            
            for(int i=0;i<qSize;i++)
            {
                TreeNode presentNode = queue.poll();
                
                if(i==qSize-1)
                    finalList.add(presentNode.val);
                
                if(presentNode.left!=null)
                    queue.offer(presentNode.left);
                
                if(presentNode.right!=null)
                    queue.offer(presentNode.right);
                
                    
            }
        }
        
        return finalList;
    }
}
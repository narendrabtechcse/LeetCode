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
    public List<Double> averageOfLevels(TreeNode root) {
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        List<Double> result = new LinkedList<>();
        
        if(root == null){
            return result;
        }

        while(!queue.isEmpty())
        {
            double sum = 0;

            int qSize = queue.size();

            for(int i=1;i<=qSize;i++) {
                 TreeNode presentNode = queue.poll();

               sum = sum + presentNode.val;

                if (presentNode.left != null)
                    queue.offer(presentNode.left);
                 if (presentNode.right != null)
                    queue.offer(presentNode.right);
            }

            result.add(sum/qSize);
        }

        return result;
     
        
    }
}
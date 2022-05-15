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
    public List<List<Integer>> levelOrder(TreeNode root) {

        Queue<TreeNode> queue = new LinkedList<>();
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
                 TreeNode presentNode = queue.poll();

                levelList.add(presentNode.val);

                if (presentNode.left != null)
                    queue.offer(presentNode.left);
                 if (presentNode.right != null)
                    queue.offer(presentNode.right);
            }

            result.add(levelList);
        }

        return result;
        
    }
}
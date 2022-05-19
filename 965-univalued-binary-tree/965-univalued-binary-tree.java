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
    public boolean isUnivalTree(TreeNode root) {
        
         return root == null || 
            ( root.left ==null ||root.val == root.left.val) 
            && (root.right ==null ||root.val == root.right.val) 
            && isUnivalTree(root.right) && isUnivalTree(root.left);
    }
}
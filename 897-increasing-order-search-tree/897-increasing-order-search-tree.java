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
     TreeNode dummy;
    TreeNode prev;
    
    public TreeNode increasingBST(TreeNode root) {
        dummy = new TreeNode(0);
        prev=dummy;
        inorder(root);
        return dummy.right;
    }
    
    public void inorder(TreeNode root)
    {
        if(root==null)
            return ;
        
        inorder(root.left);
        
        TreeNode curr = new TreeNode(root.val);
        
        prev.right = curr;
        
        prev = curr;
        
        inorder(root.right);
        
    }
}
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
    public boolean isBalanced(TreeNode root) {
        
        if(root==null)
            return true;
        
        if(maxHeight(root)-minHeight(root)>1)
            return false;
        
        boolean left_Balanced = isBalanced(root.left);
        boolean right_Balanced = isBalanced(root.right);
        
        if(left_Balanced&&right_Balanced)
            return true;
        else
            return false;
        
    }
    
    public int maxHeight(TreeNode root)
    {
        if(root==null)
            return 0;
        
        int left_height = maxHeight(root.left);
        int right_height = maxHeight(root.right);
        
        return Math.max(left_height,right_height)+1;
    }
    
     public int minHeight(TreeNode root)
    {
        if(root==null)
            return 0;
        
        int left_height = maxHeight(root.left);
        int right_height = maxHeight(root.right);
        
        return Math.min(left_height,right_height)+1;
    }
}
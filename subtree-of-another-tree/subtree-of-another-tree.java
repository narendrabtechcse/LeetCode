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
    
     public boolean isSubtreeFound(TreeNode root, TreeNode subRoot) {
        if(root==null && subRoot==null)
            return true;
        
        if(root==null || subRoot==null)
            return false;
        
        if(root.val == subRoot.val )
            return isSubtreeFound(root.left, subRoot.left) && isSubtree(root.right, subRoot.right);
        else
            return false;
        
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root==null && subRoot==null)
            return true;
        
        if(root==null || subRoot==null)
            return false;
       
        
        return isSubtreeFound(root, subRoot) || isSubtree(root.left, subRoot)  || isSubtree(root.right, subRoot);
    }
    
}
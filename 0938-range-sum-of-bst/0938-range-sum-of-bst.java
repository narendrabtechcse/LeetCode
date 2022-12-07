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
    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root==null)
        return 0;

        return inOrderTraverseSum( root,  low,  high);
    }

    int inOrderTraverseSum( TreeNode root, int low, int high)
    {
            if(root==null)
            return 0;

            if(root.val<=high && root.val>=low)
            {
                return root.val + inOrderTraverseSum(root.left,low,high) + inOrderTraverseSum(root.right,low,high);
            }else
            {
                return inOrderTraverseSum(root.left,low,high) + inOrderTraverseSum(root.right,low,high);
            }
    }
}
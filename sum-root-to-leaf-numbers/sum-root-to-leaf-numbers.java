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
  
    
    int sum =0;

    public int sumNumbers(TreeNode root) {
        if(root==null)
            return 0;

       pathSum(root,0);



        return sum;
    }

    public void pathSum(TreeNode root, int result) {

        if(root == null)
            return ;

        if(root.left==null && root.right == null )
            sum = sum + result*10 + root.val;

        if(root.left!=null)
        {

            pathSum(root.left,result*10 + root.val) ;
        }

        if(root.right!=null)
        {

            pathSum(root.right,result*10 + root.val);
        }

        return;

    }
    
    
    
    
}
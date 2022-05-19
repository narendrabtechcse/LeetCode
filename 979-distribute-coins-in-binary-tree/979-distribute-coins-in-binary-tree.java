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
     int ans = 0;
    public int distributeCoins(TreeNode root) {
        countCoins(root);
        return ans;
    }
    
    public int countCoins(TreeNode root)
    {
        if(root==null)
            return 0;
        
        int left_coins = countCoins(root.left);
        int right_coins = countCoins(root.right);
        
        ans += Math.abs(left_coins) + Math.abs(right_coins);
        
         return  left_coins + right_coins + root.val - 1;
    }
}
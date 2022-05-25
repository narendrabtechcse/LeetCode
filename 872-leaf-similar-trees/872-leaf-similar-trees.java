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
    List list1 = new ArrayList<Integer>();
    List list2 = new ArrayList<Integer>();
    
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        
        if(root1==null && root2==null)
            return true;
        else{
             helper1(root1);
             helper2(root2);
        }
        return list1.equals(list2);
    }
    
    public void helper1(TreeNode root)
    {
        if(root==null)
            return ;
        
        if(root.left==null && root.right==null)
            list1.add(root.val);
         
        
        helper1(root.left);
        helper1(root.right);
    }
    
    public void helper2(TreeNode root)
    {
        if(root==null)
            return ;
        
        if(root.left==null && root.right==null)
            list2.add(root.val);
         
        
        helper2(root.left);
        helper2(root.right);
    }
}
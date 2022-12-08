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
    List list1 = new ArrayList();
    List list2 = new ArrayList();
    
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        
        if(root1==null && root2==null)
            return true;
        if(root1==null || root2==null)
            return false;
        
        inOrderTraversal(root1, list1);
        inOrderTraversal(root2, list2);
        return list1.equals(list2);
    }
    
    private void inOrderTraversal(TreeNode root, List<Integer> out) {
        
        if(root==null)
            return;
        
        if(root.left==null && root.right==null)
        {
            out.add(root.val);
        }
        
        if(root.left!=null)
            inOrderTraversal(root.left,out);
        if(root.right!=null)
            inOrderTraversal(root.right,out);
        
    }
}
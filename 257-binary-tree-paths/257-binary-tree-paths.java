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
    
    List<String> paths = new ArrayList<String>();
     public List<String> binaryTreePaths(TreeNode root) {
      traverse(root,""); 
      return paths;
     }
    
    
    private void traverse(TreeNode node, String pre){
       if(node==null)
            paths.add(pre);
        
        String str;
        if(pre.length()==0){
            str =  String.valueOf(node.val);
        }else{
            str = pre +"->" + node.val;
        }
        
        if(node.left != null){
        traverse(node.left, str);
        }
        
        if(node.right != null){
            traverse(node.right, str);
        }
        
        if(node.left == null && node.right == null){
            paths.add(str);
            return;
        }
    }
}
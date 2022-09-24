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
    
     List<List<Integer>> result = new LinkedList<>();
    
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {    
        if(root==null)
            return result;
        
         hasPathSum(root,targetSum,new LinkedList<>());
      
        
        
        return result;
        
        
        
    }
    
    public void hasPathSum(TreeNode root, int targetSum,List<Integer> list) {
        
        if(root == null)
            return ;

        list.add(root.val);
        
        if(root.left==null && root.right == null ){
            if( targetSum-root.val==0){
            result.add(new LinkedList(list));
            }
        }
             
        if(root.left!=null)
        {
         
          hasPathSum(root.left,targetSum-root.val,list) ;
        }
             
        if(root.right!=null)
        {
         
          hasPathSum(root.right,targetSum-root.val,list);
        }
        
        list.remove(list.size()-1);
            
    }
}
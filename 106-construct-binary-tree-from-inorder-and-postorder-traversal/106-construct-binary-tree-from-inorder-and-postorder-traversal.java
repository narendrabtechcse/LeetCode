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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        
        Map<Integer, Integer> inorderValuetoIndexMap = new HashMap<>();
        for(int i=0; i<inorder.length; i++) {
            inorderValuetoIndexMap.put(inorder[i], i);
        }
        
        return buildTree(inorder, postorder, 0, inorder.length-1, 0, postorder.length-1, inorderValuetoIndexMap);
    }
    
    private TreeNode buildTree(int[] inorder, int[] postorder, int inStart, int inEnd, int postStart, int postEnd, Map<Integer, Integer> inorderValuetoIndexMap) {
        
        if(inStart > inEnd || postStart > postEnd) {
            return null;
        }
        
        int rootVal = postorder[postEnd];
        TreeNode newNode = new TreeNode(rootVal);
        
        int inOrderIndex = inorderValuetoIndexMap.get(rootVal);
        int inOrderLeftLen = inOrderIndex - inStart;
        
        newNode.left = buildTree(inorder, postorder, inStart, inOrderIndex - 1, postStart, postStart + inOrderLeftLen - 1, inorderValuetoIndexMap);
        newNode.right = buildTree(inorder, postorder, inOrderIndex + 1, inEnd, postStart + inOrderLeftLen, postEnd - 1, inorderValuetoIndexMap);
        
        return newNode;
    }
}
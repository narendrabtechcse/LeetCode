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
    public TreeNode helper(int[] preorder, int[] inorder, int inStart, int inEnd, int preStart, int preEnd, HashMap<Integer, Integer> map) {
        // base case
        if (inStart > inEnd)
            return null;
        
        // creating root
        int rootVal = preorder[preStart];
        TreeNode root = new TreeNode(rootVal);
        
        // searching for root in inorder
        int inIdx = map.get(rootVal);
        
		// hypothesis
        // Here, inIdx - inStart gives the number of nodes in leftChild/rightChild tree of the current root.
        TreeNode left = helper(preorder, inorder, inStart, inIdx - 1, preStart + 1, preStart + (inIdx - inStart), map);
        TreeNode right = helper(preorder, inorder, inIdx + 1, inEnd, preStart + (inIdx - inStart) + 1, preEnd, map);
        
        // induction
        root.left = left;
        root.right = right;
        return root;
    }
    
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int inStart = 0;
        int inEnd = inorder.length - 1;
        int preStart = 0;
        int preEnd = preorder.length - 1;
        
        // creating an inorder map for easy retrieval
        HashMap<Integer, Integer> inorderIndexMap = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            inorderIndexMap.put(inorder[i], i);
        }
        
        return helper(preorder, inorder, inStart, inEnd, preStart, preEnd, inorderIndexMap);
    }
}
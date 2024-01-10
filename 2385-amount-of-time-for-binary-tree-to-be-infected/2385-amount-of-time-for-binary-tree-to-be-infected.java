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
    TreeNode node = null;
    public int amountOfTime(TreeNode root, int start) {

        //map of <child, parent>
        Map<TreeNode, TreeNode> parentMap = new HashMap<>();
        buildParentMap(parentMap, root, start);
        if(node == null) {
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(node);

        //visited = -1 val
        node.val = -1;

        int time = 0;

        while(queue.size() > 0) {
            int qSize = queue.size();
            for(int i = 0; i < qSize; i++) {
                TreeNode node = queue.poll();
                node.val = -1;
                if(node.left != null && node.left.val != -1) {
                    queue.add(node.left);
                }
                if(node.right != null && node.right.val != -1) {
                    queue.offer(node.right);
                }
                TreeNode parent = parentMap.getOrDefault(node, null);
                if(parent != null && parent.val != -1) {
                    queue.offer(parent);
                }
            }
            if(queue.size() > 0) {
                time++;
            }
        }
        return time;
    }

    void buildParentMap(Map<TreeNode, TreeNode> hm, TreeNode root, int start) {
        if(root == null)
            return;
        if(root.val == start) {
            node = root;        
        }
        if(root.left != null) {
            hm.put(root.left, root);
            buildParentMap(hm, root.left, start);
        }
        if(root.right != null) {
            hm.put(root.right, root);
            buildParentMap(hm, root.right, start);            
        }
    }
}
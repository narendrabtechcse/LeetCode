/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public void findParent(TreeNode root, HashMap<TreeNode,TreeNode> hm)
    {
        if(root==null)
        return;
        if(root.left!=null)
        hm.put(root.left,root);
        if(root.right!=null)
        hm.put(root.right,root);
        findParent(root.left,hm);
        findParent(root.right,hm);
    }
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        HashMap<TreeNode,TreeNode> hm = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<Integer>();
        findParent(root,hm);
        Queue <TreeNode> que = new ArrayDeque<>();
        Queue <TreeNode> check = new ArrayDeque<>();
        check.add(target);
        que.add(target);
        while(que.size()!=0)
        {
            if(k==0)
            {
                while(que.size()>0)
                {
                    ans.add(que.remove().val);   
                }
            }
            int size = que.size();
            while(size>0)
            {
                TreeNode temp = que.remove();
                if(temp.left!=null && check.contains(temp.left)==false)
                {
                    check.add(temp.left);
                    que.add(temp.left);
                }
                if(temp.right!=null && check.contains(temp.right)==false)
                {
                    check.add(temp.right);
                    que.add(temp.right);
                }
                if(hm.getOrDefault(temp,null)!=null && check.contains(hm.get(temp))==false)
                {
                    check.add(hm.get(temp));
                    que.add(hm.get(temp));
                }
                size--;
            }
            k--;
        }
        return ans;
    }
}
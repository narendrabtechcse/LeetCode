/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

     public String serialize(TreeNode root) {
    if (root == null) return null;
    Deque<TreeNode> q = new LinkedList<>();
    StringBuilder sb = new StringBuilder();
    q.add(root);
    // bfs serialization
    while (!q.isEmpty()) {
      TreeNode n = q.poll();
      if (n == null) {
        sb.append('x');
      } else {
        sb.append(String.valueOf(n.val));
        q.add(n.left);
        q.add(n.right);
      }
      sb.append(',');
    }
    sb.deleteCharAt(sb.length() - 1);
    return sb.toString();
  }

  // Decodes your encoded data to tree.
  public TreeNode deserialize(String data) {
    if (data == null) return null;
    String[] tokens = data.split(",");
    TreeNode root = new TreeNode(Integer.parseInt(tokens[0]));
    Deque<TreeNode> q = new LinkedList<>();
    q.add(root);
    for (int i = 1; i < tokens.length; i += 2) {
      TreeNode node = q.poll();
      if (!tokens[i].equals("x")) {
        node.left = new TreeNode(Integer.parseInt(tokens[i]));
        q.add(node.left);
      }
      if (!tokens[i + 1].equals("x")) {
        node.right = new TreeNode(Integer.parseInt(tokens[i + 1]));
        q.add(node.right);
      }
    }
    return root;
  }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));
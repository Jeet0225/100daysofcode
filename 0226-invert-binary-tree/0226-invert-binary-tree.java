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
    
      public TreeNode invertTree1(TreeNode root) {
    if (root == null) {
        return null;
    }
    TreeNode node = invertTree(root.left);
    root.left = invertTree(root.right);
    root.right = node;
    return root;
}

// iteratively, using Queue
public TreeNode invertTree2(TreeNode root) {
    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);
    while (!queue.isEmpty()) {
        TreeNode node = queue.poll();
        if (node != null) {
            queue.add(node.left);
            queue.add(node.right);
            TreeNode tmp = node.left;
            node.left = node.right;
            node.right = tmp;
        }
    }
    return root;
}

// iteratively, using Stack
public TreeNode invertTree(TreeNode root) {
    Stack<TreeNode> stack = new Stack<>();
    stack.push(root);
    while (!stack.isEmpty()) {
        TreeNode node = stack.pop();
        if (node != null) {
            stack.push(node.right);
            stack.push(node.left);
            TreeNode tmp = node.left;
            node.left = node.right;
            node.right = tmp;
        }
    }
    return root;
}  
    }

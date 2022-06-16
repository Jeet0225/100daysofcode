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
     public List < List < Integer >> levelOrder(TreeNode root) {
        List < List < Integer >> res = new ArrayList < > ();
        Queue < TreeNode > queue = new LinkedList < > ();
        if (root == null) return res;
        queue.offer(root);
        while (!queue.isEmpty()) {
            int lvl = queue.size();
            List < Integer > sub = new ArrayList < > ();
            for (int i = 0; i < lvl; i++) {
                TreeNode node = queue.poll();
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
                sub.add(node.val);
            }
            res.add(sub);
        }
        return res;
    }
    }

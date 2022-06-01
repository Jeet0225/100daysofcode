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
        int res=0;
    public int diameterOfBinaryTree(TreeNode root) {
           getDiameter(root);
           return res==0?0:res-1;
    }
    public int getDiameter(TreeNode root){
           if(root == null)
            return 0;
         
           int lh = getDiameter(root.left);
           int rh = getDiameter(root.right);
           
            res = Math.max(res, (1+lh+rh));
        
            return  1 + Math.max(lh,rh);
     
    }
}
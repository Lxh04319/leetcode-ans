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
    int res=Integer.MAX_VALUE;
    TreeNode p=null;
    public int getMinimumDifference(TreeNode root) {
        middfs(root);
        return res;
    }
    public void middfs(TreeNode root){
        if(root==null) return;
        middfs(root.left);
        if(p!=null) res=Math.min(res,root.val-p.val);
        p=root;
        middfs(root.right);
    }
}
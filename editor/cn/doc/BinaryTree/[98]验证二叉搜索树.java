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
    TreeNode p=null;
    public boolean isValidBST(TreeNode root) {
        if(root==null) return true;
        boolean left=isValidBST(root.left);
        if(p!=null&&p.val>=root.val) return false;
        p=root;
        boolean right=isValidBST(root.right);
        return left&&right;
    }
}
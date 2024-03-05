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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return dfs(root,p,q);
    }
    public TreeNode dfs(TreeNode root,TreeNode p,TreeNode q){
        if(root==null) return root;
        if(root.val>p.val&&root.val>q.val){
            TreeNode left=dfs(root.left,p,q);
            if(left!=null) return left;
        }
        if(root.val<p.val&&root.val<q.val){
            TreeNode right=dfs(root.right,p,q);
            if(right!=null) return right;
        }
        return root;
    }
}
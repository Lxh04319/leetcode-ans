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
    public int rob(TreeNode root) {
        int[] dp=rob1(root);
        return Math.max(dp[0],dp[1]);
    }
    public int[] rob1(TreeNode root){
        int[] dp=new int[2];
        if(root==null) return dp;
        int[] left=rob1(root.left);
        int[] right=rob1(root.right);
        //不偷
        dp[0]=Math.max(left[0],left[1])+Math.max(right[0],right[1]);
        //偷
        dp[1]=root.val+left[0]+right[0];
        return dp;
    }
}
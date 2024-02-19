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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return construct(nums,0,nums.length);
    }
    public TreeNode construct(int[] nums,int left,int right){
        if(left>=right) return null;
        int rootIndex=left;
        for(int i=left+1;i<right;i++){
            if(nums[i]>nums[rootIndex]){
                rootIndex=i;
            }
        }
        TreeNode root=new TreeNode(nums[rootIndex]);
        root.left=construct(nums,left,rootIndex);
        root.right=construct(nums,rootIndex+1,right);
        return root;
    }
}
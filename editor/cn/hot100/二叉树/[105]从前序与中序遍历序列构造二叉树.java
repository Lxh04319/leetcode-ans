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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length==0||inorder==null) return null;
        TreeNode p=new TreeNode(preorder[0]);
        for(int i=0;i<preorder.length;i++){
            if(inorder[i]==preorder[0]){
                //左子树 copyOfRange左闭右开
                int[] leftpre=Arrays.copyOfRange(preorder,1,i+1);
                int[] leftin=Arrays.copyOfRange(inorder,0,i);
                int[] rightpre=Arrays.copyOfRange(preorder,i+1,preorder.length);
                int[] rightin=Arrays.copyOfRange(inorder,i+1,inorder.length);
                p.left=buildTree(leftpre,leftin);
                //右子树
                p.right=buildTree(rightpre,rightin);
                break;
            }
        }
        return p;
    }
}
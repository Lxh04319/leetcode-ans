/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null) return null;
        if(root.val==key){
            if(root.left==null) return root.right;
            else if(root.right==null) return root.left;
            else {
                TreeNode p=root.right;
                while(p.left!=null){
                    p=p.left;
                }
                p.left=root.left;
                root=root.right;
                return root;
            }
        }
        if(root.val>key) root.left=deleteNode(root.left,key);
        if(root.val<key) root.right=deleteNode(root.right,key);
        return root;
    }
}
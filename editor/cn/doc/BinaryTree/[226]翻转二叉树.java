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
    public TreeNode invertTree(TreeNode root) {
        Queue<TreeNode> queue=new LinkedList<>();
        if(root!=null) queue.add(root);
        while(!queue.isEmpty()){
            int len=queue.size();
            while(len-->0){
                TreeNode p=queue.poll();
                TreeNode leftn=p.left;
                p.left=p.right;
                p.right=leftn;
                if(p.left!=null) queue.add(p.left);
                if(p.right!=null) queue.add(p.right);
            }
        }
        return root;
    }
}
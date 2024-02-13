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
    public int minDepth(TreeNode root) {
        Queue<TreeNode> queue=new LinkedList<>();
        int mind=0;
        if(root!=null) queue.add(root);
        while(!queue.isEmpty()){
            int len=queue.size();
            mind++;
            while(len-->0){
                TreeNode p=queue.poll();
                int flag=0;
                if(p.left!=null) {
                    queue.add(p.left);
                    flag=1;
                }
                if(p.right!=null) {
                    queue.add(p.right);
                    flag=1;
                }
                if(flag==0) return mind;
            }
        }
        return mind;
    }
}
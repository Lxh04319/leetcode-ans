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
    public int maxDepth(TreeNode root) {
        Queue<TreeNode> queue=new LinkedList<>();
        int maxd=0;
        if(root!=null) {
            queue.add(root);
            //maxd++;
        }
        while(!queue.isEmpty()){
            int len=queue.size();
            while(len-->0){
                TreeNode p=queue.poll();
                if(p.left!=null) queue.add(p.left);
                if(p.right!=null) queue.add(p.right);
                //if(len==0) maxd++;
            }
            maxd++;
        }
        return maxd;
    }
}
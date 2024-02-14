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
    public boolean isSymmetric(TreeNode root) {
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root.left);
        queue.add(root.right);
        while(!queue.isEmpty()){
            int len=queue.size();
            while(len-->0){
                TreeNode l=queue.poll();
                TreeNode r=queue.poll();
                if(l==null&&r==null) continue;
                if(l==null||r==null||l.val!=r.val) return false;
                queue.add(l.left);
                queue.add(r.right);
                queue.add(l.right);
                queue.add(r.left);
            }
        }
        return true;
    }
}
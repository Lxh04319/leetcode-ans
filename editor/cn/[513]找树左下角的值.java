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
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> queue=new LinkedList<>();
        int leftnode=root.val;
        queue.add(root);
        while(!queue.isEmpty()){
            int len=queue.size();
            for(int i=len;i>0;i--){
                TreeNode p=queue.poll();
                if(i==len) leftnode=p.val;
                if(p.left!=null) queue.add(p.left);
                if(p.right!=null) queue.add(p.right);
            }
        }
        return leftnode;
    }
}
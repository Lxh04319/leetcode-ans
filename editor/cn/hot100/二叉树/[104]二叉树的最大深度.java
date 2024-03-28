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

//递归 dfs
class Solution {
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        int left=maxDepth(root.left);
        int right=maxDepth(root.right);
        return Math.max(left,right)+1;
    }
}

//非递归 层序 bfs
class Solution {
    public int maxDepth(TreeNode root) {
        int depth=0;
        Queue<TreeNode> queue=new LinkedList<>();
        if(root!=null){
            queue.add(root);
        }
        while(!queue.isEmpty()){
            int len=queue.size();
            while(len-->0){
                TreeNode p=queue.poll();
                if(p.left!=null) queue.add(p.left);
                if(p.right!=null) queue.add(p.right);
            }

            depth++;
        }
        return depth;
    }
}
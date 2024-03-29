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
//递归
class Solution {
    public boolean isSymmetric(TreeNode root) {
        return dfs(root.left,root.right);
    }
    public boolean dfs(TreeNode left,TreeNode right){
        if(left==null&&right==null) return true;
        if(left==null||right==null) return false;
        if(left.val!=right.val) return false;
        return dfs(left.left,right.right)&&dfs(left.right,right.left);
    }
}

//层序
class Solution {
    public boolean isSymmetric(TreeNode root) {
        Queue<TreeNode> queue=new LinkedList<>();
        if(root.left==null&&root.right==null) return true;
        if(root.left==null||root.right==null) return false;
        queue.add(root.left);
        queue.add(root.right);
        while(!queue.isEmpty()){
            int len=queue.size();
            while(len-->0){
                TreeNode left=queue.poll();
                TreeNode right=queue.poll();
                if(left==null&&right==null) continue;
                if(left==null||right==null) return false;
                if(left.val!=right.val) return false;
                queue.add(left.left);
                queue.add(right.right);
                queue.add(left.right);
                queue.add(right.left);
            }
        }
        return true;
    }
}
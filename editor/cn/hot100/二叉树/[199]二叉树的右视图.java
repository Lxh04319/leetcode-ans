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
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> queue=new LinkedList<>();
        List<Integer> res=new ArrayList<>();
        if(root!=null) {
            queue.add(root);
        }
        while(!queue.isEmpty()){
            int len=queue.size();
            for(int i=1;i<=len;i++){
                TreeNode p=queue.poll();
                if(p.left!=null) queue.add(p.left);
                if(p.right!=null) queue.add(p.right);
                if(i==len) res.add(p.val);
            }
        }
        return res;
    }
}
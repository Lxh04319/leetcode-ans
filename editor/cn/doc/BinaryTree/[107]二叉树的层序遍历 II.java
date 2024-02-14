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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Queue<TreeNode> queue=new LinkedList<>();
        List<List<Integer>> list=new LinkedList<>();
        if(root!=null) queue.add(root);
        while(!queue.isEmpty()){
            List<Integer> temp=new LinkedList<>();
            int len=queue.size();
            while(len-->0){
                TreeNode p=queue.poll();
                temp.add(p.val);
                if(p.left!=null) queue.add(p.left);
                if(p.right!=null) queue.add(p.right);
            }
            list.add(temp);
        }
        List<List<Integer>> res=new LinkedList<>();
        for(int i=list.size()-1;i>=0;i--){
            res.add(list.get(i));
        }
        return res;
    }
}
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
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> queue=new LinkedList<>();
        List<Double> list=new ArrayList<>();
        TreeNode p=root;
        if(root!=null) queue.add(root);
        while(!queue.isEmpty()){
            int len=queue.size();
            double sum=0.0;
            for(int i=0;i<len;i++){
                TreeNode temp=queue.poll();
                sum+=temp.val;
                if(temp.left!=null) queue.add(temp.left);
                if(temp.right!=null) queue.add(temp.right);
            }
            list.add(sum/len);
        }
        return list;
    }
}
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
    int maxValue=0;
    int cnt=0;
    TreeNode p;
    ArrayList<Integer> temp=new ArrayList<>();
    public int[] findMode(TreeNode root) {
        middfs(root);
        int[] res=new int[temp.size()];
        for(int i=0;i<temp.size();i++){
            res[i]=temp.get(i);
        }
        return res;
    }
    public void middfs(TreeNode root){
        if(root==null) return;
        middfs(root.left);
        if(p==null||p.val!=root.val) cnt=1;
        else cnt++;
        p=root;
        //
        if(cnt>maxValue){
            temp.clear();
            temp.add(root.val);
            maxValue=cnt;
        }
        else if(cnt==maxValue) temp.add(root.val);
        middfs(root.right);
    }
}
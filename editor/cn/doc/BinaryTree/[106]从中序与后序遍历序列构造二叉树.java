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
    //存位置，避免每次找根节点都循环查找
    HashMap<Integer,Integer> map=new HashMap<>();
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        return dfs(inorder,0,inorder.length,postorder,0,postorder.length);
    }
    public TreeNode dfs(int[] inorder,int inb,int ine,int[] postorder,int postb,int poste){
        if(inb>=ine||postb>=poste) return null;
        int index=map.get(postorder[poste-1]);
        TreeNode root=new TreeNode(inorder[index]);
        int left=index-inb;
        root.left=dfs(inorder,inb,index,postorder,postb,postb+left);
        root.right=dfs(inorder,index+1,ine,postorder,postb+left,poste-1);
        return root;
    }
}
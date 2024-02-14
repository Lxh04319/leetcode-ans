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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list=new LinkedList<>();
        dfsmiddle(root,list);
        return list;
    }
    public void dfsmiddle(TreeNode root,List<Integer> list){
        if(root==null) return;
        dfsmiddle(root.left,list);
        list.add(root.val);
        dfsmiddle(root.right,list);
    }
}

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
    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> stack=new Stack<>();
        List<Integer> list=new LinkedList<>();
        TreeNode p=root;
        while(p!=null||!stack.isEmpty()){
            if(p!=null){
                stack.push(p);
                p=p.left;
            }
            else{
                p=stack.pop();
                list.add(p.val);
                p=p.right;
            }
        }
        return list;
    }
}
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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list=new LinkedList<>();
        dfsback(root,list);
        return list;
    }
    public void dfsback(TreeNode root,List<Integer> list){
        if(root==null) return;
        dfsback(root.left,list);
        dfsback(root.right,list);
        list.add(root.val);
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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list=new LinkedList<>();
        Stack<TreeNode> stack=new Stack();
        TreeNode p=root;
        TreeNode pre=null;
        while(p!=null||!stack.isEmpty()){
            if(p!=null){
                stack.push(p);
                p=p.left;
            }
            else{
                p=stack.peek();
                if(p.right==null||p.right==pre){
                    list.add(p.val);
                    stack.pop();
                    pre=p;
                    p=null;
                }
                else p=p.right;
            }
        }
        return list;
    }
}
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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list=new LinkedList<>();
        dfsfront(root,list);
        return list;
    }
    public void dfsfront(TreeNode root,List<Integer> list){
        if(root==null) return;
        list.add(root.val);
        dfsfront(root.left,list);
        dfsfront(root.right,list);
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
    public List<Integer> preorderTraversal(TreeNode root) {
        Stack<TreeNode> stack=new Stack<>();
        List<Integer> list=new LinkedList<>();
        TreeNode p=root;
        while(p!=null||!stack.isEmpty()){
            if(p!=null){
                stack.push(p);
                list.add(p.val);
                p=p.left;
            }
            else{
                p=stack.pop().right;
            }
        }
        return list;
    }
}
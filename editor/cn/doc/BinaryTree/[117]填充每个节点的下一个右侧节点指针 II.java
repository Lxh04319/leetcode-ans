/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        Queue<Node> queue=new LinkedList<>();
        if(root!=null) queue.add(root);
        while(!queue.isEmpty()){
            int len=queue.size();
            Node pre=null;
            while(len-->0){
                Node p=queue.poll();
                if(pre!=null){
                    pre.next=p;
                }
                pre=p;
                if(p.left!=null) queue.add(p.left);
                if(p.right!=null) queue.add(p.right);
            }
        }
        return root;
    }
}
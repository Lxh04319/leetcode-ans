/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        Queue<Node> queue=new LinkedList<>();
        List<List<Integer>> list=new ArrayList<>();
        Node p=root;
        if(root!=null) queue.add(root);
        while(!queue.isEmpty()){
            List<Integer> temp=new ArrayList<>();
            int len=queue.size();
            while(len-->0){
                Node node=queue.poll();
                temp.add(node.val);
                for(Node c:node.children){
                    queue.add(c);
                }
            }
            list.add(temp);
        }
        return list;
    }
}
class LRUCache {
    public class Node{
        int key,value;
        Node pre,next;
        Node(int k,int v){
            this.key=k;
            this.value=v;
        }
    }
    private int capacity;
    private Map<Integer,Node> map=new HashMap<>();
    private Node dummy=new Node(0,0);
    public LRUCache(int capacity) {
        this.capacity=capacity;
        dummy.pre=dummy;
        dummy.next=dummy;
    }

    public int get(int key) {
        Node n=getNode(key);
        if(n==null) return -1;
        return n.value;
    }

    public void put(int key, int value) {
        Node n=getNode(key);
        if(n!=null){
            n.value=value;
            return;
        }
        Node p=new Node(key,value);
        if(map.size()>=capacity){
            map.remove(dummy.pre.key);
            remove(dummy.pre);
        }
        map.put(key,p);
        putfront(p);
    }

    public Node getNode(int key){
        if(!map.containsKey(key)) return null;
        Node p=map.get(key);
        remove(p);
        putfront(p);
        return p;
    }

    public void remove(Node node){
        node.pre.next=node.next;
        node.next.pre=node.pre;
    }

    public void putfront(Node node){
        node.pre=dummy;
        node.next=dummy.next;
        dummy.next.pre=node;
        dummy.next=node;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
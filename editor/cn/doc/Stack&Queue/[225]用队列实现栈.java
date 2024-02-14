class MyStack {
    Queue<Integer> queue;
    public MyStack() {
        queue=new LinkedList<>();
    }

    public void push(int x) {
        queue.add(x);
    }

    public int pop() {
        int len=queue.size()-1;
        while(len-->0){
            queue.add(queue.poll());
        }
        return queue.poll();
    }

    public int top() {
        int len=queue.size()-1;
        while(len-->0){
            queue.add(queue.poll());
        }
        int temp=queue.poll();
        queue.add(temp);
        return temp;
    }

    public boolean empty() {
        return queue.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
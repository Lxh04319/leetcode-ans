class MinStack {
    Stack<Integer> stack=new Stack<>();
    Stack<Integer> minstack=new Stack<>();
    public MinStack() {
        minstack.push(Integer.MAX_VALUE);
    }

    public void push(int val) {
        stack.push(val);
        minstack.push(Math.min(minstack.peek(),val));
    }

    public void pop() {
        stack.pop();
        minstack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minstack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();
        for(String s:tokens){
            if(s.equals("+")){
                stack.push(stack.pop()+stack.pop());
            }
            else if(s.equals("*")){
                stack.push(stack.pop()*stack.pop());
            }
            else if(s.equals("-")){
                int temp1=stack.pop();
                int temp2=stack.pop();
                stack.push(temp2-temp1);
            }
            else if(s.equals("/")){
                int temp1=stack.pop();
                int temp2=stack.pop();
                stack.push(temp2/temp1);
            }
            else stack.push(Integer.valueOf(s));
        }
        return stack.pop();
    }
}
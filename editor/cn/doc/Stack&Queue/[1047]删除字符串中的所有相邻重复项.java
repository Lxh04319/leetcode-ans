class Solution {
    public String removeDuplicates(String s) {
        char[] chars=s.toCharArray();
        //Stack<Character> stack=new Stack<Character>();
        int top=-1;
        for(char c:chars){
            // if(stack.empty()||c!=stack.peek()) {
            //     stack.push(c);
            // }
            // else if(c==stack.peek()) stack.pop();
            if(top==-1||c!=chars[top]){
                chars[++top]=c;
            }
            else top--;
        }
        top++;
        return String.valueOf(chars,0,top);
    }
}
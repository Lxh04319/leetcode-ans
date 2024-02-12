class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<Character>();
        char[] chars=s.toCharArray();
        for(int i=0;i<chars.length;i++){
            if(chars[i]=='(') stack.push(')');
            else if(chars[i]=='{') stack.push('}');
            else if(chars[i]=='[') stack.push(']');
            else if(stack.empty()||chars[i]!=stack.pop()){
                return false;
            }
        }
        if(stack.empty()){
            return true;
        }
        return false;
    }
}
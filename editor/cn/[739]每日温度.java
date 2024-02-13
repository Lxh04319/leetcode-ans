class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack=new Stack<>();
        int[] res=new int[temperatures.length];
        stack.push(0);
        for(int i=0;i<temperatures.length;i++){
            if(temperatures[i]<=temperatures[stack.peek()]) stack.push(i);
            else{
                while(!stack.isEmpty()&&temperatures[i]>temperatures[stack.peek()]){
                    res[stack.peek()]=i-stack.pop();
                }
                stack.push(i);
            }
        }
        return res;
    }
}
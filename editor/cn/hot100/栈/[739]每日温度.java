class Solution {
    public int[] dailyTemperatures(int[] tem) {
        Stack<Integer> stack=new Stack<>();
        int[] res=new int[tem.length];
        for(int i=0;i<tem.length;i++){
            if(stack.isEmpty()||tem[i]<=tem[stack.peek()]){
                stack.push(i);
            }else{
                //比栈顶大
                while(!stack.isEmpty()&&tem[i]>tem[stack.peek()]){
                    int temp=stack.pop();
                    res[temp]=i-temp;
                }
                stack.push(i);
            }
        }
        return res;
    }
}
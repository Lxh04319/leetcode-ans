class Solution {
    public int trap(int[] height) {
        Stack<Integer> stack=new Stack<>();
        stack.push(0);
        int res=0;
        for(int i=1;i<height.length;i++){
            while(!stack.isEmpty()&&height[i]>height[stack.peek()]){
                //凹槽处
                int temp=stack.pop();
                if(stack.isEmpty()) break;
                res+=(Math.min(height[i],height[stack.peek()])-height[temp])*(i-stack.peek()-1);
            }
            stack.push(i);
        }
        return res;
    }
}
class Solution {
    public int largestRectangleArea(int[] heights) {
        int area=0;
        Stack<Integer> stack=new Stack<>();
        stack.push(-1);
        for(int i=0;i<heights.length;i++){
            while(stack.peek()!=-1&&heights[i]<heights[stack.peek()]){
                //右边界-左边界-1
                area=Math.max(heights[stack.pop()]*(i-stack.peek()-1),area);
            }
            stack.push(i);
        }
        while(stack.peek()!=-1){
            area=Math.max(heights[stack.pop()]*(heights.length-stack.peek()-1),area);
        }
        return area;
    }
}
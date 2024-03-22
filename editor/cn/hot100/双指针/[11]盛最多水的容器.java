class Solution {
    public int maxArea(int[] height) {
        int slow=0,fast=height.length-1;
        int res=0;
        while(slow<fast){
            res=Math.max(res,(fast-slow)*Math.min(height[slow],height[fast]));
            if(height[slow]<=height[fast]) slow++;
            else fast--;
        }
        return res;
    }
}
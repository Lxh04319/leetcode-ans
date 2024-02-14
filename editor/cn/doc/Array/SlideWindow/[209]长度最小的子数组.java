class Solution {//尽量采取while进行更新窗口范围(好理解)--时间复杂度O(n) #不要看见for嵌套while就想到O(n^2)
    public int minSubArrayLen(int target, int[] nums) {
        int res=Integer.MAX_VALUE;
        int i=0,j=0;
        int sum=0;
        for(i=0,j=0;j<nums.length;j++){
            sum+=nums[j];
            //缩小窗口
            while(sum>=target){
                res=Math.min(res,j-i+1);
                sum-=nums[i];
                i++;
            }
        }
        return res==Integer.MAX_VALUE?0:res;
    }
}

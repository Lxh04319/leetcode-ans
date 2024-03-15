class Solution {
    public int rob(int[] nums) {
        if(nums.length==1) return nums[0];
        return Math.max(dp(nums,0,nums.length-1),dp(nums,1,nums.length));
    }
    //不使用数组的dp
    public int dp(int[] nums,int start,int end){
        int dp0=0,dp1=0;
        for(int i=start;i<end;i++){
            int temp=Math.max(dp1,dp0+nums[i]);
            dp0=dp1;
            dp1=temp;
        }
        return dp1;
    }
    // public int dp(int[] nums,int start,int end){
    //     int[] dp=new int[nums.length+1];
    //     dp[start]=nums[start];
    //     if(nums.length>2) dp[start+1]=Math.max(nums[start+1],dp[start]);
    //     for(int i=start+2;i<end;i++){
    //         dp[i]=Math.max(dp[i-2]+nums[i],dp[i-1]);
    //     }
    //     return dp[end-1];
    // }
}
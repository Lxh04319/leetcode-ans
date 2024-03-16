class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int[] dp=new int[nums.length];
        Arrays.fill(dp,1);
        int maxx=dp[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                dp[i]=dp[i-1]+1;
            }
            maxx=Math.max(maxx,dp[i]);
        }
        return maxx;
    }
}
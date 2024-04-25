class Solution {
    public boolean canPartition(int[] nums) {
        int target=0;
        for(int i=0;i<nums.length;i++){
            target+=nums[i];
        }
        if(target%2==1) return false;
        target/=2;
        int[] dp=new int[target+1];
        for(int i=0;i<nums.length;i++){
            for(int j=target;j>=nums[i];j--){
                dp[j]=Math.max(dp[j],dp[j-nums[i]]+nums[i]);
            }
        }
        return dp[target]==target;
    }
}
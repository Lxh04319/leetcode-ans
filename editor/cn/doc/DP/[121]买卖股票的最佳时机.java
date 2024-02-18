//贪心
class Solution {
    public int maxProfit(int[] prices) {
        int low=Integer.MAX_VALUE;
        int res=0;
        for(int i=0;i<prices.length;i++){
            low=Math.min(low,prices[i]);
            res=Math.max(res,prices[i]-low);
        }
        return res;
    }
}

//dp
class Solution {
    public int maxProfit(int[] prices) {
        int length=prices.length;
        int[][] dp=new int[length][2];
        dp[0][0]=-prices[0];
        dp[0][1]=0;
        for(int i=1;i<length;i++){
            dp[i][0]=Math.max(dp[i-1][0],-prices[i]);
            dp[i][1]=Math.max(dp[i-1][1],prices[i]+dp[i-1][0]);
        }
        return dp[length-1][1];
    }
}
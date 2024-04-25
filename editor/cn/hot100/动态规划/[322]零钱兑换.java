class Solution {
    public int coinChange(int[] coins, int amount) {
        if(amount==0) return 0;
        int[][] dp=new int[coins.length+1][amount+1];
        for(int[] p:dp){
            Arrays.fill(p,Integer.MAX_VALUE/2);
        }
        dp[0][0]=0;
        for(int i=1;i<coins.length+1;i++){
            for(int j=0;j<amount+1;j++){
                dp[i][j]=dp[i-1][j];
                if(j-coins[i-1]>=0)
                    dp[i][j]=Math.min(dp[i][j],dp[i][j-coins[i-1]]+1);
            }
        }
        if(dp[coins.length][amount]==Integer.MAX_VALUE/2){
            return -1;
        }
        return dp[coins.length][amount];
    }
} 
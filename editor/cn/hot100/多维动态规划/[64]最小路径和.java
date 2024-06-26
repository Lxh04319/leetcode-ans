class Solution {
    public int minPathSum(int[][] grid) {
        int[][] dp=new int[grid.length][grid[0].length];
        int sum=0;
        for(int i=0;i<grid.length;i++){
            sum+=grid[i][0];
            dp[i][0]=sum;
        }
        sum=0;
        for(int i=0;i<grid[0].length;i++){
            sum+=grid[0][i];
            dp[0][i]=sum;
        }
        sum=0;
        for(int i=1;i<grid.length;i++){
            for(int j=1;j<grid[0].length;j++){
                dp[i][j]=Math.min(dp[i-1][j],dp[i][j-1])+grid[i][j];
            }
        }
        return dp[grid.length-1][grid[0].length-1];
    }
}
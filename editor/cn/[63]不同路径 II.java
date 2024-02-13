class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        //行
        int m=obstacleGrid.length;
        //列
        int n=obstacleGrid[0].length;
        int[][] dp=new int[m][n];
        if(obstacleGrid[0][0]==1||obstacleGrid[m-1][n-1]==1) return 0;
        for(int i=0;i<m;i++){
            if(obstacleGrid[i][0]==0) dp[i][0]=1;
            else {
                dp[i][0]=0;
                break;
            }
        }
        for(int i=0;i<n;i++){
            if(obstacleGrid[0][i]==0) dp[0][i]=1;
            else {
                dp[0][i]=0;
                break;
            }
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(obstacleGrid[i][j]==0) dp[i][j]=dp[i-1][j]+dp[i][j-1];
                else dp[i][j]=0;
            }
        }
        return dp[m-1][n-1];
    }
}
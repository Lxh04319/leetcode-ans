class Solution {
    public int[][] generateMatrix(int n) {
        int k=1;
        int o=0;
        int[][] res=new int[n][n];
        int len=0;
        int i;
        while(len++<n/2){
            for(i=o;i<n-len;i++) res[o][i]=k++;
            for(i=o;i<n-len;i++) res[i][n-len]=k++;
            for(i=n-len;i>=len;i--) res[n-len][i]=k++;
            for(i=n-len;i>=len;i--) res[i][len-1]=k++;
            //len++;
            o++;
        }
        if(n%2==1){
            res[o][o]=k;
        }
        return res;
    }
}

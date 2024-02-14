class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res=new ArrayList<>();
        int i,o=0,len=0;
        int m=matrix.length;
        int n=matrix[0].length;
        int t=Math.min(m,n);
        while(len++<t/2){
            for(i=o;i<n-len;i++) res.add(matrix[o][i]);
            for(i=o;i<m-len;i++) res.add(matrix[i][n-len]);
            for(i=n-len;i>=len;i--) res.add(matrix[m-len][i]);
            for(i=m-len;i>=len;i--) res.add(matrix[i][len-1]);
            o++;
        }
        if(t%2==1){
            if(t==m){
                for(i=o;i<=n-len;i++) res.add(matrix[o][i]);
            }
            else for(i=o;i<=m-len;i++) res.add(matrix[i][o]);
        }
        return res;
    }
}

class Solution {
    public void setZeroes(int[][] matrix) {
        boolean rowflag=false,colflag=false;
        int m=matrix.length;
        int n=matrix[0].length;
        //首行首列
        for(int i=0;i<m;i++){
            if(matrix[i][0]==0) rowflag=true;
        }
        for(int j=0;j<n;j++){
            if(matrix[0][j]==0) colflag=true;
        }
        //其他
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(matrix[i][j]==0) matrix[i][0]=matrix[0][j]=0;
            }
        }
        //置零
        for(int i=1;i<m;i++){
            if(matrix[i][0]==0) Arrays.fill(matrix[i],0);
        }
        for(int j=1;j<n;j++){
            if(matrix[0][j]==0){
                for(int i=1;i<m;i++) matrix[i][j]=0;
            }
        }
        //首行首列置零
        if(rowflag==true){
            for(int i=0;i<m;i++) matrix[i][0]=0;
        }
        if(colflag==true) Arrays.fill(matrix[0],0);
    }
}
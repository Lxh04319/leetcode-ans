class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //bst 
        int col=matrix[0].length-1,row=0;
        while(row<matrix.length&&col>=0){
            if(matrix[row][col]==target) return true;
            //大值 搜查右子树
            if(matrix[row][col]<target){
                row++;
            }
            //左子树
            else{
                col--;
            }
        }
        return false;
    }
}
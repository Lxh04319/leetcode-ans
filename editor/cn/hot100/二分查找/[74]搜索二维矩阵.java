//二分查找
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length,n=matrix[0].length;
        int left=0,right=m*n-1;
        while(left<=right){
            int mid=(right-left)/2+left;
            if(matrix[mid/n][mid%n]==target) return true;
            if(matrix[mid/n][mid%n]<target) left=mid+1;
            else right=mid-1;
        }
        return false;
    }
}
//抽象bst
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
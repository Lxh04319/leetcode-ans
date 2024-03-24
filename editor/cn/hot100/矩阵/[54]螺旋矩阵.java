class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res=new ArrayList<>();
        int left=0,right=matrix[0].length-1,high=0,low=matrix.length-1;
        while(true){
            //→
            for(int i=left;i<=right;i++){
                res.add(matrix[high][i]);
            }
            high++;
            if(high>low) break;
            //↓
            for(int i=high;i<=low;i++){
                res.add(matrix[i][right]);
            }
            right--;
            if(right<left) break;
            //←
            for(int i=right;i>=left;i--){
                res.add(matrix[low][i]);
            }
            low--;
            if(low<high) break;
            //↑
            for(int i=low;i>=high;i--){
                res.add(matrix[i][left]);
            }
            left++;
            if(left>right) break;
        }
        return res;
    }
}
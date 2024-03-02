class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points,(a,b)->Integer.compare(a[0],b[0]));
        int cnt=1;
        //右边界
        int p=points[0][1];
        for(int i=1;i<points.length;i++){
            //重叠
            if(points[i][0]<=p){
                p=Math.min(p,points[i][1]);
            }
            else{
                p=points[i][1];
                cnt++;
            }
        }
        return cnt;
    }
}
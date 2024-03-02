class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        //以左边界排序
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        int cnt=0;
        int p=intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            //重叠
            if(intervals[i][0]<p){
                p=Math.min(p,intervals[i][1]);
                cnt++;
            }
            else p=intervals[i][1];
        }
        return cnt;
    }
}
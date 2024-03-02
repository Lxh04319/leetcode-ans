class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        List<int[]> res=new LinkedList<>();
        //左右边界
        int left=intervals[0][0];
        int right=intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]<=right){
                //重叠，更新最大右边界
                right=Math.max(right,intervals[i][1]);
            }
            else{
                //不重叠，更新结果
                res.add(new int[]{left,right});
                left=intervals[i][0];
                right=intervals[i][1];
            }
        }
        res.add(new int[]{left,right});
        return res.toArray(new int[res.size()][2]);
    }
}
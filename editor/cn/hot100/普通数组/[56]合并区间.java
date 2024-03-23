class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        List<int[]> list=new ArrayList<>();
        int left=intervals[0][0],right=intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            //重叠
            if(intervals[i][0]<=right){
                right=Math.max(right,intervals[i][1]);
            }else{
                list.add(new int[]{left,right});
                left=intervals[i][0];
                right=intervals[i][1];
            }
        }
        list.add(new int[]{left,right});
        return list.toArray(new int[list.size()][2]);
    }
}
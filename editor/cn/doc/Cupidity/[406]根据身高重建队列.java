class Solution {
    public int[][] reconstructQueue(int[][] people) {
        //先排序
        Arrays.sort(people,(a,b)->a[0]==b[0]?a[1]-b[1]:b[0]-a[0]);
        LinkedList<int[]> queue=new LinkedList<>();
        //依次插入
        for(int[] t:people){
            queue.add(t[1],t);
        }
        return queue.toArray(new int[queue.size()][2]);
    }
}
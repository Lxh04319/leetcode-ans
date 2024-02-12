class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> q=new LinkedList<>();
        int[] res=new int[nums.length-k+1];
        //存坐标
        for(int i=0;i<nums.length;i++){
            while(!q.isEmpty()&&nums[q.getLast()]<=nums[i]){
                q.removeLast();
            }
            q.addLast(i);
            if(i-q.getFirst()==k) q.removeFirst();
            if(i>=k-1) res[i-k+1]=nums[q.getFirst()];
        }
        return res;
    }
}
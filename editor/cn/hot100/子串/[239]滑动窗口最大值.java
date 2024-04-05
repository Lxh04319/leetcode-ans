class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> queue=new LinkedList<>();
        int[] res=new int[nums.length-k+1];
        for(int i=0;i<nums.length;i++){
            while(!queue.isEmpty()&&nums[queue.getLast()]<=nums[i]){
                queue.removeLast();
            }
            queue.addLast(i);
            if(i-queue.getFirst()==k) queue.removeFirst();
            if(i>=k-1) res[i-k+1]=nums[queue.getFirst()];
        }
        return res;
    }
}
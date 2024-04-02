class Solution {
    public int jump(int[] nums) {
        int pre=0;
        int range=0;
        int cnt=0;
        if(nums.length==1) return 0;
        for(int i=0;i<nums.length;i++){
            range=Math.max(range,i+nums[i]);
            if(i==pre){
                pre=range;
                cnt++;
                if(pre>=nums.length-1) break;
            }
        }
        return cnt;
    }
}
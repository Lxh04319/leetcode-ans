class Solution {
    public int jump(int[] nums) {
        int range=0;
        int cnt=0;
        int cur=0;
        if(nums.length==1) return 0;
        for(int i=0;i<nums.length;i++){
            range=Math.max(i+nums[i],range);
            if(i==cur){
                cnt++;
                cur=range;
                if(range>=nums.length-1) break;
            }
        }
        return cnt;
    }
}
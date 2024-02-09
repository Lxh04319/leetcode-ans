class Solution {
    public int search(int[] nums, int target) {
        if(target<nums[0]||target>nums[nums.length-1]) return -1;
        int len;
        int left=0,right=nums.length-1;
        while(left<=right){
            len=(left+right)/2;
            if(nums[len]==target) return len;
            if(nums[len]>target) right=len-1;
            else if(nums[len]<target) left=len+1;
        }
        return -1;
    }
}

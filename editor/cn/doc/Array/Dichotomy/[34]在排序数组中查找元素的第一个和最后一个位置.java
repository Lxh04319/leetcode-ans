class Solution {//分别寻找左边界和右边界 只需讨论nums[mid]==target情况即可
    public int[] searchRange(int[] nums, int target) {
        int leftb=lb(nums,target);
        int rightb=rb(nums,target);
        return new int[]{leftb,rightb};
    }
    public int lb(int[] nums,int target){
        int l=0,r=nums.length-1;
        int mid;
        while(l<=r){
            mid=l+(r-l)/2;
            if(target==nums[mid]){//在最左端或左一位小于target 说明已找到左边界
                if(mid==0||nums[mid-1]<target) return mid;
                r=mid-1;
            }
            else if(target<nums[mid]) r=mid-1;
            else l=mid+1;
        }
        return -1;
    }
    public int rb(int[] nums,int target){
        int l=0,r=nums.length-1;
        int mid;
        while(l<=r){
            mid=l+(r-l)/2;
            if(target==nums[mid]){//右边界同理
                if(mid==nums.length-1||nums[mid+1]>target) return mid;
                l=mid+1;
            }
            else if(target<nums[mid]) r=mid-1;
            else l=mid+1;
        }
        return -1;
    }
}

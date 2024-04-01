class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left=leftb(nums,target);
        int right=rightb(nums,target);
        return new int[]{left,right};
    }
    public int leftb(int[] nums,int target){
        int left=0,right=nums.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(nums[mid]==target){
                if(mid==0||nums[mid-1]<target) return mid;
                right=mid-1;
            }
            else if(nums[mid]>target) right=mid-1;
            else left=mid+1;
        }
        return -1;
    }
    public int rightb(int[] nums,int target){
        int left=0,right=nums.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(nums[mid]==target){
                if(mid==nums.length-1||nums[mid+1]>target) return mid;
                left=mid+1;
            }
            else if(nums[mid]>target) right=mid-1;
            else left=mid+1;
        }
        return -1;
    }
}
class Solution {
    public int search(int[] nums, int target) {
        int left=0,right=nums.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(nums[mid]==target) return mid;
            //左侧
            if(nums[mid]>=nums[left]){
                //左侧
                if(target<=nums[mid]&&target>=nums[left]) right=mid-1;
                    //右侧
                else left=mid+1;
            }
            else{
                if(target<=nums[right]&&target>=nums[mid]) left=mid+1;
                else right=mid-1;
            }
        }
        return -1;
    }
}
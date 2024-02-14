class Solution {//注意！！！返回left(可分为left==right和left+1==right讨论情况--->最终结果得出都是left)
    public int searchInsert(int[] nums, int target) {
        int l=0,r=nums.length-1;
        int mid;
        while(l<=r){
            mid=l+(r-l)/2;
            if(target==nums[mid]) return mid;
            if(target<nums[mid]) r=mid-1;
            else l=mid+1;
        }
        return l;
    }
}

class Solution {//快慢指针 快指针查找重复元素 慢指针负责指向需要覆盖的位置--->不改变顺序
    public int removeDuplicates(int[] nums) {
        int fast=0,slow=0;
        for(fast=0;fast<nums.length;fast++){
            //if(nums[fast]==nums[slow])
            if(nums[fast]!=nums[slow]){
                slow++;
                nums[slow]=nums[fast];
            }
        }
        return slow+1;
    }
}

class Solution {//快慢指针 覆盖 注意慢指针+1(重复的下一个元素)
    public int removeDuplicates(int[] nums) {
        int fast=0,slow=0;
        for(fast=0;fast<nums.length;fast++){
            if(nums[fast]!=nums[slow]){
                slow++;
                nums[slow]=nums[fast];
            }
        }
        return slow+1;
    }
}

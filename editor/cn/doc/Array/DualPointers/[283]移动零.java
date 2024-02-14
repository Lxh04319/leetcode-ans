class Solution {//两次遍历 第一次快慢指针 第二次把数组后面元素改为0
    public void moveZeroes(int[] nums) {
        if(nums==null) return;
        int fast=0,slow=0;
        for(fast=0;fast<nums.length;fast++){
            //if(nums[fast]==0)
            if(nums[fast]!=0){
                nums[slow++]=nums[fast];
                //nums[slow]=0;
            }
        }
        //if(slow!=nums.length-1){
        //注意此处为i=slow 不是i=slow+1 在第一次遍历中最后一次已进行slow++
        for(int i=slow;i<nums.length;i++){
            nums[i]=0;
        }
        //}
    }
}

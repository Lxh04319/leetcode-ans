class Solution {
    public int[] sortedSquares(int[] nums) {
        int l=0,r=nums.length-1;
        int p=nums.length-1;
        int[] res=new int[nums.length];
        while(l<=r){//从后往前更新答案 谁大谁上
            if(nums[l]*nums[l]>nums[r]*nums[r]){
                res[p--]=nums[l]*nums[l];
                l++;
            }
            else{
                res[p--]=nums[r]*nums[r];
                r--;
            }
        }
        return res;
    }
}

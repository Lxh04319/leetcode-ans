class Solution {
    public void nextPermutation(int[] nums) {
        int k=nums.length-1;
        //从后往前找到第一个降序
        while(k-1>=0&&nums[k-1]>=nums[k]){
            k--;
        }
        if(k==0){
            reverse(nums,0,nums.length-1);
        }else{
            int temp=k;
            //从该数往后找到第一个比它大的并交换
            while(temp+1<nums.length&&nums[temp+1]>nums[k-1]){
                temp++;
            }
            swap(nums,temp,k-1);
            reverse(nums,k,nums.length-1);
        }
    }
    public void reverse(int[] nums,int start,int end){
        int left=start,right=end;
        while(left<right){
            swap(nums,left,right);
            left++;
            right--;
        }
    }
    public void swap(int[] nums,int a,int b){
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
}
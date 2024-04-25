class Solution {
    public void sortColors(int[] nums) {
        int left=0,right=nums.length-1,cur=0;
        while(cur<=right){
            if(nums[cur]==0){
                swap(nums,left,cur);
                left++;
                cur++;
            }else if(nums[cur]==1){
                cur++;
            }else{
                swap(nums,right,cur);
                right--;
            }
        }
    }
    public void swap(int[] nums,int a,int b){
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
}
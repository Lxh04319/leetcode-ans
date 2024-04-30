class Solution {
    public int firstMissingPositive(int[] nums) {
        int len=nums.length;
        //原地哈希
        for(int i=0;i<len;i++){
            while(nums[i]>=1&&nums[i]<=len&&nums[i]!=nums[nums[i]-1]){
                swap(nums,i,nums[i]-1);
            }
        }
        for(int i=0;i<len;i++){
            if(nums[i]!=i+1) return i+1;
        }
        return len+1;
    }
    public void swap(int[] nums,int a,int b){
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
}
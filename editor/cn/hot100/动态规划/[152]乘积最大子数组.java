class Solution {
    public int maxProduct(int[] nums) {
        int maxdp=nums[0],mindp=nums[0];
        int max=maxdp;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<0){
                int temp=maxdp;
                maxdp=mindp;
                mindp=temp;
            }
            maxdp=Math.max(maxdp*nums[i],nums[i]);
            mindp=Math.min(mindp*nums[i],nums[i]);
            max=Math.max(maxdp,max);
        }
        return max;
    }
}
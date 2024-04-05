class Solution {
    public int findDuplicate(int[] nums) {
        int left=1,right=nums.length-1;
        int cnt=0;
        while(left<=right){
            int mid=(left+right)/2;
            cnt=0;
            for(int j=0;j<nums.length;j++){
                if(nums[j]<=mid) cnt++;
            }
            if(cnt>mid) right=mid-1;
            else left=mid+1;
        }
        return left;
    }
}
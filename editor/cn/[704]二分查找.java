class Solution {//采用左闭右闭区间 模板记一个就行(等于号和减一问题)
    public int search(int[] nums, int target) {
        if(target<nums[0]||target>nums[nums.length-1]){
            return -1;
        }
        int l=0,r=nums.length-1;
        int mid;
        while(l<=r){//注意<=
            mid=l+(l-r)/2;//防溢出
            if(target==nums[mid]) return mid;
            if(target<nums[mid]){
                r=mid-1;//注意-1
            }
            else {
                l=mid+1;
            }
        }
        return -1;
    }
}
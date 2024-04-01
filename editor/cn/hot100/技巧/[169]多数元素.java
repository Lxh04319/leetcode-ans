//排序取中值
class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}

//摩尔投票法
class Solution {
    public int majorityElement(int[] nums) {
        int cnt=1,num=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]==num) cnt++;
            else{
                cnt--;
                if(cnt==0) {
                    num=nums[i];
                    cnt=1;
                }
            }
        }
        return num;
    }
}
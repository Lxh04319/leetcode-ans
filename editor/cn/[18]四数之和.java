class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> list=new ArrayList<>();
        Arrays.sort(nums);
        int left,right;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0&&nums[i]>target) break;
            if(i>0&&nums[i]==nums[i-1]) continue;
            for(int j=i+1;j<nums.length;j++){
                if(j>i+1&&nums[j]==nums[j-1]) continue;
                left=j+1;
                right=nums.length-1;
                while(right>left){
                    if(nums[i]+nums[j]+nums[left]+nums[right]>target) right--;
                    else if(nums[i]+nums[j]+nums[left]+nums[right]<target) left++;
                    else{
                        list.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
                        while(right>left&&nums[right]==nums[right-1]) right--;
                        while(right>left&&nums[left]==nums[left+1]) left++;
                        right--;
                        left++;
                    }
                }
            }
        }
        return list;
    }
}
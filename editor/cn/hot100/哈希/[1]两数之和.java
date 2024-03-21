class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> ctr=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(ctr.containsKey(target-nums[i])){
                return new int[]{ctr.get(target-nums[i]),i};
            }
            ctr.put(nums[i],i);
        }
        return new int[]{0,0};
    }
}
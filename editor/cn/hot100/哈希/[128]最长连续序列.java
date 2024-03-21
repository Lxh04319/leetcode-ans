class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++) set.add(nums[i]);
        int res=0;
        for(int i:set){
            if(!set.contains(i-1)){
                int p=i;
                while(set.contains(p+1)) p++;
                res=Math.max(res,p-i+1);
            }
        }
        return res;
    }
}
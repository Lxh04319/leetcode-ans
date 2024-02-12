class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        int left, right;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0)
                break;
            if (i>0&&nums[i] == nums[i - 1])
                continue;
            left = i + 1;
            right = nums.length - 1;
            while (right > left) {
                if (nums[i] + nums[left] + nums[right] > 0) {
                    right--;
                } else if (nums[i] + nums[left] + nums[right] < 0) {
                    left++;
                } else {
                    list.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    while(right>left&&nums[right]==nums[right-1]) right--;
                    while(right>left&&nums[left]==nums[left+1]) left++;
                    right--;
                    left++;
                }
            }
        }
        return list;
    }
}
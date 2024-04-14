class Solution {
    List<List<Integer>> res=new ArrayList<>();
    List<Integer> temp=new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        backtracking(nums);
        return res;
    }
    public void backtracking(int[] nums){
        if(temp.size()==nums.length) res.add(new ArrayList<>(temp));
        for(int i=0;i<nums.length;i++){
            if(temp.contains(nums[i])) continue;
            temp.add(nums[i]);
            backtracking(nums);
            temp.removeLast();
        }
    }
}
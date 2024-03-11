class Solution {
    List<List<Integer>> res=new ArrayList<>();
    List<Integer> p=new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        backtracking(nums);
        return res;
    }
    public void backtracking(int[] nums){
        if(p.size()==nums.length){
            res.add(new ArrayList<>(p));
        }
        for(int i=0;i<nums.length;i++){
            if(p.contains(nums[i])) continue;
            p.add(nums[i]);
            backtracking(nums);
            p.removeLast();
        }
    }
}
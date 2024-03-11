class Solution {
    List<List<Integer>> res=new ArrayList<>();
    List<Integer> p=new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        backtracking(nums,0);
        return res;
    }
    public void backtracking(int[] nums,int index){
        res.add(new ArrayList<>(p));
        if(index>=nums.length) return;
        for(int i=index;i<nums.length;i++){
            p.add(nums[i]);
            backtracking(nums,i+1);
            p.removeLast();
        }
    }
}
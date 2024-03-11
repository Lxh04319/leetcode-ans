class Solution {
    List<List<Integer>> res=new ArrayList<>();
    List<Integer> p=new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        backtracking(nums,0);
        return res;
    }
    public void backtracking(int[] nums,int index){
        res.add(new ArrayList<>(p));
        for(int i=index;i<nums.length;i++){
            if(i>index&&nums[i-1]==nums[i]) continue;
            p.add(nums[i]);
            backtracking(nums,i+1);
            p.removeLast();
        }
    }
}
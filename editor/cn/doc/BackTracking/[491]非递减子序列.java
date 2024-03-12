class Solution {
    List<List<Integer>> res=new ArrayList<>();
    List<Integer> p=new ArrayList<>();
    public List<List<Integer>> findSubsequences(int[] nums) {
        backtracking(nums,0);
        return res;
    }
    public void backtracking(int[] nums,int index){
        if(p.size()>=2) res.add(new ArrayList<>(p));
        HashSet<Integer> hash=new HashSet<>();
        for(int i=index;i<nums.length;i++){
            //保证递增 且集合不重复(hash)，不排序，且数据范围不大，所以采用hash
            if(!p.isEmpty()&&p.get(p.size()-1)>nums[i]||hash.contains(nums[i])){
                continue;
            }
            p.add(nums[i]);
            hash.add(nums[i]);
            backtracking(nums,i+1);
            p.removeLast();
        }
    }
}
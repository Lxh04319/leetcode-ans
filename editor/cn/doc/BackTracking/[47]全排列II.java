class Solution {
    List<List<Integer>> res=new ArrayList<>();
    List<Integer> p=new ArrayList<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        boolean[] visited=new boolean[nums.length];
        backtracking(nums,visited);
        return res;
    }
    public void backtracking(int[] nums,boolean[] visited){
        if(p.size()==nums.length){
            res.add(new ArrayList<>(p));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(visited[i]) continue;
            if(i>0&&nums[i]==nums[i-1]&&visited[i-1]) continue;
            p.add(nums[i]);
            visited[i]=true;
            backtracking(nums,visited);
            p.removeLast();
            visited[i]=false;
        }
    }
}
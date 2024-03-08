class Solution {
    List<List<Integer>> res=new ArrayList<>();
    List<Integer> p=new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        backtracking(candidates,0,0,target);
        return res;
    }
    public void backtracking(int[] candidates,int index,int sum,int target){
        if(sum>=target){
            if(sum==target) res.add(new ArrayList<>(p));
            return ;
        }
        for(int i=index;i<candidates.length;i++){
            p.add(candidates[i]);
            backtracking(candidates,i,sum+candidates[i],target);
            p.removeLast();
        }
    }
}
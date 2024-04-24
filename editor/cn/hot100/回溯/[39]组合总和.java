class Solution {
    List<List<Integer>> res=new ArrayList<>();
    List<Integer> p=new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        backtracking(candidates,0,target,0);
        return res;
    }
    public void backtracking(int[] candidates,int sum,int target,int index){
        if(sum>=target){
            if(sum==target) res.add(new ArrayList<>(p));
            return;
        }
        for(int i=index;i<candidates.length;i++){
            p.add(candidates[i]);
            backtracking(candidates,sum+candidates[i],target,i);
            p.removeLast();
        }
    }

}
class Solution {
    List<List<Integer>> res=new ArrayList<>();
    List<Integer> p=new ArrayList<>();
    int sum=0;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        backtracking(candidates,target,0);
        return res;
    }
    public void backtracking(int[] candidates,int target,int index){
        if(sum>=target){
            if(sum==target) res.add(new ArrayList<>(p));
            return ;
        }
        for(int i=index;i<candidates.length;i++){
            if(i>index&&candidates[i]==candidates[i-1]) continue;
            sum+=candidates[i];
            p.add(candidates[i]);
            backtracking(candidates,target,i+1);
            sum-=p.getLast();
            p.removeLast();
        }
    }
}
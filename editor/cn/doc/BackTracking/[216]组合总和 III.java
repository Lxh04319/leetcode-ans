class Solution {
    List<List<Integer>> res=new ArrayList<>();
    List<Integer> p=new ArrayList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        hs(k,n,1,0);
        return res;
    }
    public void hs(int k,int n,int index,int sum){
        if(sum>n) return;
        if(p.size()==k){
            if(sum==n) res.add(new ArrayList<>(p));
            return ;
        }
        for(int i=index;i<=9;i++){
            p.add(i);
            sum+=i;
            hs(k,n,i+1,sum);
            p.removeLast();
            sum-=i;
        }
    }
}
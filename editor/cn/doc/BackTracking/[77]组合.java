class Solution {
    List<List<Integer>> res=new ArrayList<>();
    List<Integer> p=new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        hs(n,k,1);
        return res;
    }
    public void hs(int n,int k,int index){
        if(p.size()==k){
            res.add(new ArrayList<>(p));
            return ;
        }
        //剪枝
        for(int i=index;i<=n-(k-p.size())+1;i++){
            p.add(i);
            hs(n,k,i+1);
            p.removeLast();
        }
    }
}
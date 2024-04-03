class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> first=new ArrayList<>();
        first.add(1);
        res.add(first);
        for(int i=1;i<numRows;i++){
            List<Integer> list=new ArrayList<>();
            List<Integer> pre=res.get(i-1);
            list.add(1);
            for(int j=0;j<i-1;j++){
                list.add(pre.get(j)+pre.get(j+1));
            }
            list.add(1);
            res.add(list);
        }
        return res;
    }
}
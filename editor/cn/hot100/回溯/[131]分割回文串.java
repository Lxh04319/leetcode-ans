class Solution {
    List<List<String>> res=new ArrayList<>();
    List<String> p=new ArrayList<>();
    public List<List<String>> partition(String s) {
        backtracking(s,0);
        return res;
    }
    public void backtracking(String s,int index){
        if(index>=s.length()){
            res.add(new ArrayList<>(p));
            return;
        }
        for(int i=index;i<s.length();i++){
            //加入回文
            if(hw(s,index,i)){
                String str=s.substring(index,i+1);
                p.add(str);
            }else{
                continue;
            }
            backtracking(s,i+1);
            p.removeLast();
        }
    }
    public boolean hw(String str,int start,int end){
        int left=start,right=end;
        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
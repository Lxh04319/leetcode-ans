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
            //回文 加入
            if(ishw(s,index,i)){
                String string=s.substring(index,i+1);
                p.add(string);
            }else{
                continue;
            }
            backtracking(s,i+1);
            p.removeLast();
        }
    }
    //判断回文
    public boolean ishw(String string,int index,int i){
        int left=index,right=i;
        while(left<right){
            if(string.charAt(left)!=string.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
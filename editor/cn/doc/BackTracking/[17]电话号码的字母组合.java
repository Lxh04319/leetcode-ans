class Solution {
    List<String> res=new ArrayList<>();
    //对应2-9
    String[] num={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
        if(digits==null||digits.length()==0) return res;
        backtracking(digits,new StringBuilder(),0);
        return res;
    }
    public void backtracking(String digits,StringBuilder l,int cnt){
        if(cnt==digits.length()){
            res.add(l.toString());
            return;
        }
        String s=num[digits.charAt(cnt)-'0'];
        for(int i=0;i<s.length();i++){
            l.append(s.charAt(i));
            backtracking(digits,l,cnt+1);
            l.deleteCharAt(l.length()-1);
        }
    }
}
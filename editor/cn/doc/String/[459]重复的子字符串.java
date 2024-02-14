class Solution {
    public boolean repeatedSubstringPattern(String s) {
        char[] chars=s.toCharArray();
        int[] next=new int[s.length()];
        int j=0;
        next[0]=0;
        for(int i=1;i<s.length();i++){
            while(j>0&&chars[i]!=chars[j]){
                j=next[j-1];
            }
            if(chars[i]==chars[j]){
                j++;
            }
            next[i]=j;
        }
        int n=next[s.length()-1];
        int m=s.length()-n;
        if(n!=0&&s.length()%m==0) {
            return true;
        }
        return false;
    }
}
class Solution {
    public int strStr(String haystack, String needle) {
        int[] next=new int[needle.length()+1];
        char[] h=haystack.toCharArray();
        char[] n=needle.toCharArray();
        next[0]=0;
        int i=1,j=0;
        for(;i<needle.length();i++){
            while(j>0&&n[i]!=n[j]){
                j=next[j-1];
            }
            if(n[i]==n[j]){
                j++;
            }
            //注意
            next[i]=j;
        }
        for(i=0,j=0;i<haystack.length();i++){
            while(j>0&&h[i]!=n[j]) j=next[j-1];
            if(h[i]==n[j]) j++;
            if(j==needle.length()) return i-needle.length()+1;
        }
        return -1;
    }
}
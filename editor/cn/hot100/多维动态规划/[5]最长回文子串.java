class Solution {
    public String longestPalindrome(String s) {
        int len=s.length();
        boolean[][] dp=new boolean[len][len];
        int start=0,end=0,max=1;
        if(len==1) return s;
        for(int i=1;i<len;i++){
            for(int j=0;j<i;j++){
                if(s.charAt(i)==s.charAt(j)&&(i-j<=2||dp[j+1][i-1])){
                    dp[j][i]=true;
                    if(i-j+1>max){
                        max=i-j+1;
                        start=j;
                        end=i;
                    }
                }
            }
        }
        return s.substring(start,end+1);
    }
}
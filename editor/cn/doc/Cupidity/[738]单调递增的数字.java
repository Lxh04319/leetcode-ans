class Solution {
    public int monotoneIncreasingDigits(int n) {
        //转字符操作
        String s=String.valueOf(n);
        //9的位置
        int p=s.length();
        char[] chars=s.toCharArray();
        for(int i=s.length()-2;i>=0;i--){
            if(chars[i]>chars[i+1]){
                chars[i]--;
                p=i+1;
            }
        }
        for(int i=p;i<s.length();i++){
            chars[i]='9';
        }
        return Integer.parseInt(String.valueOf(chars));
    }
}
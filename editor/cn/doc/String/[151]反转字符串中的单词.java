class Solution {
    public String reverseWords(String s) {
        char[] chars=s.toCharArray();
        chars=removespace(chars);
        reverse(chars,0,chars.length-1);
        reverseword(chars);
        return new String(chars);
    }
    public char[] removespace(char[] chars){
        int slow=0,fast=0;
        for(;fast<chars.length;fast++){
            if(chars[fast]!=' '){
                if(slow!=0) chars[slow++]=' ';
                while(fast<chars.length&&chars[fast]!=' '){
                    chars[slow++]=chars[fast++];
                }
            }
        }
        String rems=new String(chars);
        String ans=rems.substring(0,slow);
        return ans.toCharArray();
    }
    public void reverse(char[] chars,int left,int right){
        if(right>=chars.length) return ;
        while(left<right){
            char temp=chars[left];
            chars[left]=chars[right];
            chars[right]=temp;
            left++;
            right--;
        }
    }
    public void reverseword(char[] chars){
        int left=0;
        for(int right=0;right<=chars.length;right++){
            if(right==chars.length||chars[right]==' '){
                reverse(chars,left,right-1);
                left=right+1;
            }
        }
    }
}
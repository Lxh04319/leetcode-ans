class Solution {
    public String reverseStr(String s, int k) {
        int left,right;
        char[] s1=s.toCharArray();
        for(int i=0;i<s.length();i+=2*k){
            left=i;
            right=Math.min(left+k-1,s.length()-1);
            while(left<right){
                char temp=s1[left];
                s1[left]=s1[right];
                s1[right]=temp;
                left++;
                right--;
            }
        }
        return new String(s1);
    }
}
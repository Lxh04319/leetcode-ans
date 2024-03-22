class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int[] word=new int[26];
        for(int i=0;i<p.length();i++) word[p.charAt(i)-'a']++;
        int left=0;
        int cnt=0;
        int len=0;
        List<Integer> res=new ArrayList<>();
        for(int i=0;i<26;i++) if(word[i]!=0) len++;
        for(int i=0;i<s.length();i++){
            word[s.charAt(i)-'a']--;
            if(word[s.charAt(i)-'a']==0) cnt++;
            //挪动窗口
            if(i-left+1>p.length()){
                word[s.charAt(left)-'a']++;
                if(word[s.charAt(left)-'a']==1) cnt--;
                left++;
            }
            if(cnt==len) res.add(left);
        }
        return res;
    }
}
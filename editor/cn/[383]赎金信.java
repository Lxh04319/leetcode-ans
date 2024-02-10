class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] hash=new int[26];
        for(int i=0;i<magazine.length();i++){
            hash[magazine.charAt(i)-'a']++;
        }
        for(int i=0;i<ransomNote.length();i++){
            if(hash[ransomNote.charAt(i)-'a']!=0){
                hash[ransomNote.charAt(i)-'a']--;
            }
            else return false;
        }
        return true;
    }
}

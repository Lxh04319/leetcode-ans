class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> list=new LinkedList<>();
        int[] hash=new int[26];
        for(int i=0;i<s.length();i++){
            hash[s.charAt(i)-'a']=i;
        }
        int start=0,end=0;
        for(int i=0;i<s.length();i++){
            end=Math.max(end,hash[s.charAt(i)-'a']);
            if(i==end){
                list.add(end-start+1);
                start=end+1;
            }
        }
        return list;
    }
}
class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0) return 0;
        HashMap<Character,Integer> map=new HashMap<>();
        int left=0;
        int maxx=0;
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                //窗口内有该元素
                if(map.get(s.charAt(i))>=left){
                    left=map.get(s.charAt(i))+1;
                }
                //没有
                else{
                    left=left;
                }
            }
            //处理元素
            map.put(s.charAt(i),i);
            maxx=Math.max(maxx,i-left+1);
        }
        return maxx;
    }
}
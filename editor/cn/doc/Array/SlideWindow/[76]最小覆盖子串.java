class Solution {//上一题的加强版
    public String minWindow(String s, String t) {
        //建立两个哈希表分别统计s和t包含的字符和个数
        HashMap<Character,Integer> hashs=new HashMap<>();
        HashMap<Character,Integer> hasht=new HashMap<>();
        for(int i=0;i<t.length();i++){//统计t
            hasht.put(t.charAt(i),hasht.getOrDefault(t.charAt(i),0)+1);
        }
        int l=0,r=0;
        int num=0;
        int min=Integer.MAX_VALUE;
        String ans="";
        for(;r<s.length();r++){
            //统计s
            hashs.put(s.charAt(r),hashs.getOrDefault(s.charAt(r),0)+1);
            //扩大窗口--t包含右指针指向的字符且目前数量小于t中的数量 说明需要计入
            if(hasht.containsKey(s.charAt(r))&&hashs.get(s.charAt(r))<=hasht.get(s.charAt(r))){
                num++;//用于统计已匹配的字符数是否达到t包含的字符数
            }
            //收缩窗口--t中不包含左指针指向的字符或者该字符数已大于t中该字符的数量 说明可以往右缩小窗口
            while(l<r&&(!hasht.containsKey(s.charAt(l))||hashs.get(s.charAt(l))>hasht.get(s.charAt(l)))){
                hashs.put(s.charAt(l),hashs.get(s.charAt(l))-1);
                l++;
            }
            //已匹配数等于t包含的字符数 说明该窗口满足条件
            //更新窗口最小长度和结果
            if(num==t.length()&&r-l+1<min){
                min=r-l+1;
                ans=s.substring(l,r+1);
            }
        }
        return ans;
    }
}

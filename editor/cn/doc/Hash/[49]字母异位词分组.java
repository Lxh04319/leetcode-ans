class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map=new HashMap<String,List<String>>();
        for(String s:strs){
            char[] chr=s.toCharArray();
            Arrays.sort(chr);
            String news=new String(chr);
            List<String> l=map.getOrDefault(news,new ArrayList());
            l.add(s);
            map.put(news,l);
        }
        return new ArrayList<List<String>>(map.values());
    }
}

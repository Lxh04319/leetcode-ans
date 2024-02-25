class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int cnt=0;
        int p=0;
        for(int i=0;i<s.length&&p<g.length;i++){
            if(s[i]>=g[p]){
                cnt++;
                p++;
            }
        }
        return cnt;
    }
}
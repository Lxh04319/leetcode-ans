class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int total=0,cur=0,index=0;
        for(int i=0;i<gas.length;i++){
            cur+=gas[i]-cost[i];
            total+=gas[i]-cost[i];
            if(cur<0){
                index=i+1;
                cur=0;
            }
        }
        if(total<0) return -1;
        return index;
    }
}
class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set=new HashSet<>();
        while(true){
            int sum=0;
            while(n>0){
                int t=n%10;
                sum+=t*t;
                n/=10;
            }
            if(sum==1) return true;
            if(set.contains(sum)) return false;
            else{
                set.add(sum);
                n=sum;
            }
        }
    }
}

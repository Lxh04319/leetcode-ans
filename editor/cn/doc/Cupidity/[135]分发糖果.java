class Solution {
    public int candy(int[] ratings) {
        int len=ratings.length;
        int[] res=new int[len];
        res[0]=1;
        //左到右
        for(int i=1;i<len;i++){
            if(ratings[i]>ratings[i-1]) res[i]=res[i-1]+1;
            else res[i]=1;
        }
        //右到左
        for(int i=len-2;i>=0;i--){
            if(ratings[i]>ratings[i+1]){
                res[i]=Math.max(res[i],res[i+1]+1);
            }
        }
        int sum=0;
        for(int num:res){
            sum+=num;
        }
        return sum;
    }
}
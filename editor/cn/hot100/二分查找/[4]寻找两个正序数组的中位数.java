class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length,n=nums2.length;
        if((m+n)%2==1) return getk(nums1,nums2,(m+n)/2+1);
            //注意此处浮点数处理
        else return (getk(nums1,nums2,(m+n)/2)+getk(nums1,nums2,(m+n)/2+1))*0.5;
    }
    public int getk(int[] nums1,int[] nums2,int k){
        int i=0,j=0;
        int m=nums1.length,n=nums2.length;
        while(true){
            if(i==m) return nums2[j+k-1];
            if(j==n) return nums1[i+k-1];
            if(k==1) return Math.min(nums1[i],nums2[j]);
            int temp=k/2;
            int newi=Math.min(i+temp,m)-1,newj=Math.min(j+temp,n)-1;
            if(nums1[newi]<=nums2[newj]){
                k-=newi-i+1;
                i=newi+1;
            }else{
                k-=newj-j+1;
                j=newj+1;
            }
        }
    }
}
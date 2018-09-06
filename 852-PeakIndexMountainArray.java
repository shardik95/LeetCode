class Solution {
    public int peakIndexInMountainArray(int[] A) {
        return helper(A,0,A.length-1);
    }
    
    public int helper(int[] A,int l,int r){
        if(l<=r){
            int m = (l+r)/2;
            if(m+1<A.length && A[m]>A[m+1] && m-1>=0 && A[m]>A[m-1]){
                return m;
            }
            else if(m+1<A.length && A[m]>A[m+1] && m-1>0 && A[m]<A[m-1]){
                return helper(A,l,m-1);
            }
            else
                return helper(A,m+1,r);
        }
        return -1;
    }
}
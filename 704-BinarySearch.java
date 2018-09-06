class Solution {
    public int search(int[] nums, int target) {
        return binarySearch(nums,0,nums.length-1,target);
    }
    
    int binarySearch(int[] A,int l,int r,int x){
        if(l<=r){
            int m = (l+r)/2;
            if(A[m]==x)
                return m;
            else if(A[m]>x)
                return binarySearch(A,0,m-1,x);
            else return binarySearch(A,m+1,r,x);
        }
        return -1;
    }
}
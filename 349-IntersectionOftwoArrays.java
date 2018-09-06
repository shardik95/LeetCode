class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        if(nums1.length<nums2.length){
            Arrays.sort(nums1);
            for(int i=0;i<nums2.length;i++){
                int x = binarySearch(nums1,0,nums1.length-1,nums2[i]);
                if(x>-1)
                    set.add(nums2[i]);
            }
        }
        else{
            Arrays.sort(nums2);
            for(int i=0;i<nums1.length;i++){
                int x = binarySearch(nums2,0,nums2.length-1,nums1[i]);
                if(x>-1)
                    set.add(nums1[i]);
            }
        }
        int result[] = new int[set.size()];
        int t=0;
        for(int i:set){
            result[t++] = i;
        }
        return result;
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
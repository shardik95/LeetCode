class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length>nums2.length)
            return findMedianSortedArrays(nums2,nums1);
        
        int n1 = nums1.length;
        int n2 = nums2.length;
        
        int low = 0;
        int high = n1;
        
        while(low<=high){
            int partitionx = (low+high)/2;
            int partitiony = (n1+n2+1)/2 - partitionx;
            
            int xleft = (partitionx==0)? Integer.MIN_VALUE : nums1[partitionx-1];
            int xright = (partitionx==n1)? Integer.MAX_VALUE : nums1[partitionx];
            
            int yleft = (partitiony==0)? Integer.MIN_VALUE : nums2[partitiony-1];
            int yright = (partitiony==n2)? Integer.MAX_VALUE : nums2[partitiony];
            
            if(xleft<=yright && yleft<=xright){
                if((n1+n2)%2==0){
                    return ((double)Math.max(xleft, yleft) + Math.min(xright, yright))/2;
                }
                else return (double)Math.max(xleft,yleft);
            }
            else if(xleft>yright)
                high = partitionx -1;
            else
                low = partitionx + 1;
        }
        return -1;
    }
}
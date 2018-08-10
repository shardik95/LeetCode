class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int temp[] = new int[m];
        for(int i=0;i<m;i++)
            temp[i] = nums1[i];
        int l = 0;
        int r = 0;
        int c = 0;
        while(l<temp.length && r<nums2.length){
            if(temp[l]<=nums2[r]){
                nums1[c++] = temp[l];
                l++;
            }
            else{
                nums1[c++] = nums2[r];
                r++;
            }
        }
        while(l<temp.length){
             nums1[c++] = temp[l];
             l++;
        }
        while(r<nums2.length){
            nums1[c++] = nums2[r];
            r++;
        }
    }
}
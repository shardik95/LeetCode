class Solution {
    public int findMin(int[] nums) {
        if(nums.length==0||nums==null)
            return 0;
        int l = 0;
        int r = nums.length-1;
        while(l<r){
            if(nums[l]<nums[r])
                return nums[l];
            int m = l+(r-l)/2;
            if(nums[l]<nums[m])
                l=m+1;
            else if(nums[l]>nums[m])
                r = m;
            else l++;
        }
        return nums[l];
    }
}
class Solution {
    public int searchInsert(int[] nums, int target) {
        return searchHelper(nums,0,nums.length-1,target);
    }
    
    int searchHelper(int[] nums,int low, int high, int target){
        if(low<=high){
            int m = (low+high)/2;
            if(nums[m]==target) return m;
            else if(nums[m]>target)
                return searchHelper(nums,low,m-1,target);
            else return searchHelper(nums,m+1,high,target);
        }
        else return low;
    }
}
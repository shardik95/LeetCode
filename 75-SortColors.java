class Solution {
    public void sortColors(int[] nums) {
        if(nums.length==0 || nums==null)
            return;
        int left = 0;
        int mid = 0;
        int right = nums.length-1;
        while(mid<=right){
            if(nums[mid]==0){
                nums[mid] = nums[left];
                nums[left]=0;
                mid++;
                left++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                nums[mid] = nums[right];
                nums[right] = 2;
                right--;
            }
        }
    }
}
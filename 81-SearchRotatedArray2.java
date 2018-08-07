class Solution {
    public boolean search(int[] nums, int target) {
        int brkpt = -1;
        for(int i=0;i<nums.length;i++){
            if(i<nums.length-1&&nums[i]>nums[i+1]){
                brkpt = i;
                break;
            }
        }
        if(brkpt==-1)
            return Arrays.binarySearch(nums,target)>=0;
        else{
            if(target>=nums[0]&&target<=nums[brkpt]){
                int temp[] = Arrays.copyOfRange(nums,0,brkpt+1);
                return Arrays.binarySearch(temp,target)>=0;
            }
            else{
                int temp[] = Arrays.copyOfRange(nums,brkpt+1,nums.length);
                return Arrays.binarySearch(temp,target)>=0;
            }
        }
    }
}
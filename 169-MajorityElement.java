class Solution {
    public int majorityElement(int[] nums) {
        int candidate = getCandidate(nums);
        int count =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==candidate)
                count++;
        }
        if(count>nums.length/2)
            return candidate;
        else return -1;
    }
    
    private int getCandidate(int []nums){
        int count = 0;
        int maj_index = 0;
        for(int i=0;i<nums.length;i++){
            if(count==0){
                maj_index = i;
            }
             if(nums[i]==nums[maj_index])
                count++;
            else count--;
        }
        return nums[maj_index];
    }
}
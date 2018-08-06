class Solution {
    public int firstMissingPositive(int[] nums) {
        int min = Integer.MAX_VALUE;
        int positive = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0)
                positive++;
            if(min>nums[i])
                min = nums[i];
        }
        if(min!=1)
            return 1;
        else{
            for(int i=0;i<nums.length;i++){
                if(nums[i]<=0 || nums[i]>positive)
                    nums[i]=1;
            }
            for(int i=0;i<nums.length;i++){
                int n = Math.abs(nums[i]);
                if(nums[n-1]>0)
                    nums[n-1]=-nums[n-1];
            }
            for(int i=0;i<nums.length;i++)
                if(nums[i]>0)
                    return i+1;
            return positive+1;
        }
        
    }
}
class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        int left=0;
        int min = 99999;
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            while(sum>=s){
                min=Math.min(min,i-left+1);
                sum=sum-nums[left];
                left++;
            }
        }
        return min==99999? 0:min;
    }
}
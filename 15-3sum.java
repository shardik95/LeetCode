class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        if(nums.length<3)
            return ans;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            int start = i+1;
            if(i>0 && nums[i]==nums[i-1])continue;
            int end = nums.length-1;
            while(start<end){
                int sum = nums[start]+nums[end]+nums[i];
                if(sum==0){
                    ans.add(Arrays.asList(nums[i],nums[start],nums[end]));
                    while(start<end && nums[start]==nums[start+1]) start++;
                    while(start<end && nums[end]==nums[start-1]) end--;
                    start++;
                    end--;
                }
                else if(sum<0)
                    start++;
                else end--;
            }
        }
        return ans;
    }
}
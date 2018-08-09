class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        int diff = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                int temp = i - map.get(nums[i]);
                map.put(nums[i],temp);
                diff = Math.min(diff,temp);
            }
            else{
                map.put(nums[i],i);
            }
        }
        
        return diff<=k;
    }
}
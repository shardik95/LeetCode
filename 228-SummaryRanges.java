class Solution {
    public List<String> summaryRanges(int[] nums) {
        int left = 0;
        List<String> ans = new ArrayList<String>();
        for(int i=0;i<nums.length;i++){
            left = i;
            while(i+1<nums.length && nums[i]+1==nums[i+1])
                i++;
            if(left!=i)
                ans.add(""+nums[left]+"->"+nums[i]);
            else 
                ans.add(""+nums[left]);
        }
        return ans;
    }
}
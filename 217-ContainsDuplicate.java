class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for(int num:nums)
            set.add(num);
        if(set.size()!=nums.length)
            return true;
        else return false;
    }
}
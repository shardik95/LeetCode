class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stk = new Stack<Integer>();
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int nums:nums2){
            while(!stk.isEmpty() && stk.peek()<nums){
                map.put(stk.pop(),nums);
            }
            stk.push(nums);
        }
        int res[] = new int[nums1.length];
        int i=0;
        for(int num:nums1){
            if(map.containsKey(num))
                res[i++]=map.get(num);
            else res[i++]=-1;
        }
        return res;
    }
}
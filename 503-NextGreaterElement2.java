class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stk = new Stack<Integer>();
        int res[] = new int[nums.length];
        for(int i=2*nums.length-1;i>=0;i--){
            while(!stk.isEmpty() && nums[stk.peek()]<=nums[i%nums.length])
                stk.pop();
            res[i%nums.length] = stk.isEmpty()?  -1:nums[stk.peek()];
            stk.push(i%nums.length);
        }
        return res;
    }
}
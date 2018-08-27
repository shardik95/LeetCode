class Solution {
    public boolean find132pattern(int[] nums) {
        if(nums.length<3)
            return false;
        int[] min = new int[nums.length];
        Stack<Integer> stk = new Stack<Integer>();
        min[0]=nums[0];
        for(int i=1;i<nums.length;i++)
            min[i]=Math.min(min[i-1],nums[i]);
        for(int i=nums.length-1;i>=0;i--){
            while(!stk.isEmpty() && stk.peek()<=min[i])
                stk.pop();
            if(!stk.isEmpty() && stk.peek()<nums[i])
                return true;
            stk.push(nums[i]);
        }
        return false;
    }
}
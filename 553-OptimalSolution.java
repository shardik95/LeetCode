class Solution {
    public String optimalDivision(int[] nums) {
        
        StringBuilder sb = new StringBuilder();
        if(nums.length==1){
             sb.append(nums[0]);
             return sb.toString();
        }
        if(nums.length==2){
             sb.append(nums[0]);
             sb.append("/");
             sb.append(nums[1]);
             return sb.toString();
        }
        sb = new StringBuilder();
        sb.append(nums[0]);
        sb.append("/(");
        sb.append(nums[1]);
        for(int i=2;i<nums.length;i++){
            sb.append("/"+nums[i]);
        }
        sb.append(")");
        return sb.toString();
    }
}
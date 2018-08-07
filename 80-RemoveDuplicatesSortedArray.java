class Solution {
    public int removeDuplicates(int[] nums) {
        int count =0;
        int index = 0;
        int len = 0;
        for(int i=0;i<nums.length;i++){
            count =1;
            int num = nums[i];
            while(i<nums.length-1 && nums[i]==nums[i+1]){
                i++;
                count++;
            }
            count = count>=2?2:count;
            for(int k=0;k<count;k++){
                nums[index++]=num;
                len++;
            }
        }
        return len;
    }
}
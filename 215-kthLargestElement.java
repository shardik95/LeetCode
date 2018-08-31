class Solution {
    public int findKthLargest(int[] nums, int k) {
        return quickSelect(nums,0,nums.length-1,nums.length-k);
    }
    
    public int quickSelect(int[] nums,int l,int r,int k){
        if(l<=r){
            int p = partition(nums,l,r);
            if(p==k)
                return nums[k];
            if(k<p)
                return quickSelect(nums,l,p-1,k);
            else if(k>p)
                return quickSelect(nums,p+1,r,k);
         }
        return -1;
    }
    
    public int partition(int[] nums,int l,int r){
        int pivot = nums[r];
        int j=0;
        int i=j-1;
        for(j=0;j<r;j++){
            if(nums[j]<=pivot){
                i++;
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
            }
        }
        int temp = nums[i+1];
        nums[i+1] = nums[r];
        nums[r] = temp;
        return i+1;
    }
}
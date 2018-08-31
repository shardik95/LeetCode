class Solution {
    public int maxSubArray(int[] nums) {
        return maxSubArrayHelper(nums,0,nums.length-1);
    }
    
    public int maxSubArrayHelper(int nums[],int l,int r){
        if(l==r)
            return nums[r];
        else{
            int m = (l+r)/2;
            return Math.max(crossArray(nums,l,m,r),Math.max(maxSubArrayHelper(nums,l,m),maxSubArrayHelper(nums,m+1,r)));
        }
    }
    
    public int crossArray(int[] nums,int l,int m,int r){
        int sum=0;
        int leftsum=Integer.MIN_VALUE;
        int rightsum=Integer.MIN_VALUE;
        
        for(int i=m;i>=l;i--){
            sum=sum+nums[i];
            if(sum>leftsum)
                leftsum=sum;
        }
        
        sum=0;
        for(int i=m+1;i<=r;i++){
            sum=sum+nums[i];
            if(sum>rightsum)
                rightsum=sum;
        }
        
        return leftsum+rightsum;
    }
}
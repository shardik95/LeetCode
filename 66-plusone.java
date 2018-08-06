class Solution {
    public int[] plusOne(int[] digits) {
        int car = 0;
        for(int i=digits.length-1;i>=0;i--){
            int sum = 0;
            if(i==digits.length-1){
                sum = sum+1;
            }
            sum = sum+digits[i]+car;
            digits[i]=sum%10;
            car = sum/10;
        }
        if(car==0)
            return digits;
        else{
            int ans[]=new int[digits.length+1];
            for(int i=digits.length-1;i>=0;i--){
                ans[i+1]=digits[i];
            }
            ans[0]=1;
            return ans;
        }
    }
}
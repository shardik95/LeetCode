class Solution {
    public int mySqrt(int x) {
        if(x==1 || x==0)
            return x;
        int start = 1, end = x/2;
        int ans = 0;
        while(start<=end){
            long mid = (start+end)/2;
            long temp = mid*mid;
            if(temp==x)
                return (int)mid;
            else if(temp>x){
                end = (int)mid-1;
            }
            else {
                start = (int)mid+1;
                ans = (int)mid;
            }
        }
        return ans;
    }
}
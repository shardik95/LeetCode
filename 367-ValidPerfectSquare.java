class Solution {
    public boolean isPerfectSquare(int num) {
        int x = mySqrt(num);
        if(x*x==num)
            return true;
        else return false;
    }
    
    public int mySqrt(int x) {
        if(x==0||x==1)
            return x;
        long start = 0;
        long end = x/2;
        while(start<=end){
            long mid = (end+start)/2;
            long temp = mid*mid;
            if(temp ==x)
                return (int)mid;
            else if(temp<x)
                start = mid+1;
            else end = mid-1;
        }
        return (int)start-1;
    }
}
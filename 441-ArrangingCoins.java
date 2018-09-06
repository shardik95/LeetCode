class Solution {
    public int arrangeCoins(int n) {
        int k =1;
        while(n>=0){
            n=n-k;
            k=k+1;
        }
        return k-2;
    }
}
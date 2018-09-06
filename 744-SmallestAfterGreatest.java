class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        return helper(letters,0,letters.length-1,target);
    }
    
    char helper(char[] A,int l, int r,int x){
        if(l<=r){
            int m = (l+r)/2;
            if(A[m]==x){
                while(A[m]==x)
                    m=(m+1)%A.length;
                return A[m];
            }
            else if(A[m]<x)
                return helper(A,m+1,r,x);
            else return helper(A,l,m-1,x);
        }
        return A[l%A.length];
    }
}
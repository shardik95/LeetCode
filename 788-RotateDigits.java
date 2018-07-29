class Solution {
    public int rotatedDigits(int N) {
        int count = 0;
        for(int i=1;i<=N;i++){
           if(isRotation(i))
               count++;
        }
        return count;
    }
    
    public boolean isRotation(int n){
        int count=0;
        while(n>0){
            int d = n%10;
            if(d==2||d==5||d==6||d==9)
                count++;
            else if(d==3||d==4||d==7)
                return false;
            n=n/10;
        }
        return count>0;
    }
    
}
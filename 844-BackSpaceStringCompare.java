class Solution {
    public boolean backspaceCompare(String S, String T) {
        int count1=0;
        int count2=0;
        int i = S.length()-1;
        int j = T.length()-1;
        
        while(i>=0 || j>=0){
            
            while(i>=0){
                if(S.charAt(i)=='#'){
                    count1++;
                    i--;
                }
                else if(count1!=0){
                    count1--;
                    i--;
                }
                else{
                    break;
                }
            }
            
            
            while(j>=0){
                if(T.charAt(j)=='#'){
                    count2++;
                    j--;
                }
                else if(count2!=0){
                    count2--;
                    j--;
                }
                else{
                    break;
                }
            }
            
            if(i>=0 && j>=0 && S.charAt(i)!=T.charAt(j))
                return false;
            
            if((i>=0 && j<0) || (j>=0 && i<0))
                return false;
            i--;
            j--;
        }
        return true;
    }
}
class Solution {
    public boolean isNumber(String s) {
        s=s.trim();
        boolean isNumber = false;
        boolean isE = false;
        boolean numberAfterE = true;
        boolean isPoint = false;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                isNumber = true;
                numberAfterE = true;
            }
            else if(s.charAt(i)=='.'){
                if(isPoint || isE)
                    return false;
                isPoint = true;
            }
            else if(s.charAt(i)=='e'){
                if(!isNumber || isE)
                    return false;
                isE = true;
                numberAfterE = false;
            }
            else if(s.charAt(i)=='+'||s.charAt(i)=='-'){
                if(i!=0 && s.charAt(i-1)!='e')
                    return false;
            }
            else{
                return false;
            }
        }
        
        return isNumber && numberAfterE;
    }
}
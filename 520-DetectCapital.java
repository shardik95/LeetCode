class Solution {
    public boolean detectCapitalUse(String word) {
        int countCap = 0;
        int firstLetterCap = 0;
        for(int i=0;i<word.length();i++){
            char x = word.charAt(i);
            if(x>='A'&& x<='Z'){
                if(i==0)
                    firstLetterCap = 1;
                countCap++;
            }
        }
        if(firstLetterCap == 1 && countCap == word.length())
            return true;
        if(firstLetterCap == 1 && countCap == 1)
            return true;
        if(firstLetterCap == 0 && countCap == 0)
            return true;
        
        return false;
    }
}
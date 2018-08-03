class Solution {
    public int minDistance(String word1, String word2) {
        int memo[][] = new int[word1.length()+1][word2.length()+1]; 
        for(int i=0;i<=word1.length();i++){
            for(int j=0;j<=word2.length();j++){
                if(i==0||j==0)
                    continue;
                if(word1.charAt(i-1)==word2.charAt(j-1))
                    memo[i][j]=1+memo[i-1][j-1];
                else{
                    memo[i][j] = Math.max(memo[i-1][j],memo[i][j-1]);
                }
            }
        }
        return word1.length()+word2.length()-2*memo[word1.length()][word2.length()];
    }
    
   
    
    
}
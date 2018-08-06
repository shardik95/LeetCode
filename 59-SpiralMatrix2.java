class Solution {
    public int[][] generateMatrix(int n) {
        
        int ans[][] = new int[n][n];

        int colstart = 0;
        int colend = ans[0].length-1;
        int rowstart = 0;
        int rowend = ans.length-1;
        
        int count = 1;
        while(rowstart<=rowend && colstart<=colend){
            
            for(int i=colstart;i<=colend;i++){
                ans[rowstart][i]=count;
                count++;
            }
            rowstart++;
            for(int i=rowstart;i<=rowend;i++){
                ans[i][colend]=count;
                count++;
            }
            colend--;
            for(int i=colend;i>=colstart;i--){
                ans[rowend][i]=count;
                count++;
            }
            rowend--;
            for(int i=rowend;i>=rowstart;i--){
                ans[i][colstart]=count;
                count++;
            }
            colstart++;
            
        }
        
        return ans;
    }
}
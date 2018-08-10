class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        if(matrix.length==0 || matrix[0].length==0)
            return ans;
        
        int rowstart = 0;
        int rowend = matrix.length-1;
        int colstart = 0;
        int colend = matrix[0].length-1;
        int count =1;
        int limit = (rowend+1)*(colend+1);
        
        while(rowstart<=rowend && colstart<=colend && count<=limit){
            //System.out.println(count);
            for(int i=colstart;i<=colend;i++){
                if(count>limit)
                    return ans;
                ans.add(matrix[rowstart][i]);
                count++;
            }
            rowstart++;
            
            for(int i=rowstart;i<=rowend;i++){
                if(count>limit)
                    return ans;
                ans.add(matrix[i][colend]);
                count++;
            }
            colend--;
            
            for(int i=colend;i>=colstart;i--){
                if(count>limit)
                    return ans;
                ans.add(matrix[rowend][i]);
                count++;
            }
            rowend--;
            
            for(int i=rowend;i>=rowstart;i--){
                if(count>limit)
                    return ans;
                ans.add(matrix[i][colstart]);
                count++;
            }
            colstart++;
            
            if(rowend<rowstart || colend<colstart)
                break;
        }
        return ans;
    }
}
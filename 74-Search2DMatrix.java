class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length==0||matrix[0].length==0)
            return false;
        
        int m = matrix.length-1;
        int n = matrix[0].length-1;
        
        if(matrix[0][0]>target || matrix[m][n]<target)
            return false;
        
        int low = 0;
        int high = m;
        int row = 0;
        while(low<=high){
             row = low+(high-low)/2;
            if(matrix[row][0]<=target && matrix[row][n]>=target)
                return Arrays.binarySearch(matrix[row],target)>=0;
            else if(matrix[row][0]>target)
                high = row-1;
            else 
                low = row+1;
        }
        return false;
    }
}
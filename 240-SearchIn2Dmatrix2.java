class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length==0)
            return false;
        return searchMatrixHelper(matrix,0,0,matrix.length-1,matrix[0].length-1,target);
    }
    
    public boolean searchMatrixHelper(int[][] matrix, int x1,int y1,int x2, int y2, int target){
         if(x2<x1 || y2<y1 || x1>=matrix.length || y1>=matrix[0].length || x2<0 || y2<0)
            return false;
        int mx = (x2-x1)/2+x1;
        int my = (y2-y1)/2+y1;
        
        if(matrix[mx][my]==target)
            return true;
        else if(matrix[mx][my]<target){
            return searchMatrixHelper(matrix,x1,my+1,x2,y2,target) || searchMatrixHelper(matrix,mx+1,y1,x2,my,target);
        }else if(matrix[mx][my]>target){
            return searchMatrixHelper(matrix,x1,y1,x2,my-1,target) || searchMatrixHelper(matrix,x1,my,mx-1,y2,target);
        }else
            return false;
    }
}
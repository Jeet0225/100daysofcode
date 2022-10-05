class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        
         int r = matrix.length;
         int c = matrix[0].length;
        
             for(int i=1; i<r; i++){
                for(int j=0; j<c; j++){
                   if(i>0 && j>0 && matrix[i][j] != matrix[i-1][j-1]){
                       return false;

                   }
                }
            }
        return true;
    }
}
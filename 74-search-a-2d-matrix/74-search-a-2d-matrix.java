class Solution {
    public boolean searchMatrix(int[][] mat, int target) {
        
        int n = mat.length;
        int m = mat[0].length;
        
        int low = 0;
        int high = (n*m)-1;
        
        while(low<=high){
            int mid = (low + (high-low)/2);
            if(mat[mid/m][mid%m] == target){
                return true;
        }
        if(mat[mid/m][mid%m] < target){
            low = mid+1;
        }else{
            high = mid-1;
        }
            
        }
        return false;
    }
}
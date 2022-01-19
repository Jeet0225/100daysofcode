class Solution {
    public int trap(int[] arr) {
        int n = arr.length;
        int res = 0;
        int left = 0, right = n-1;
        int leftmax = 0, rightmax =0;
        while(left <= right){
            if(arr[left] <= arr[right]){
                if(arr[left] > leftmax) leftmax = arr[left];
                else res = res + (leftmax - arr[left]);
                
                left++;
            }else{
                if(arr[right] > rightmax)
                    rightmax = arr[right];
                else 
                    res = res + (rightmax - arr[right]);
                right--;
            }
        }
        return res;
        
    }
}
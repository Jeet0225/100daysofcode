class Solution {
    public void nextPermutation(int[] nums) {
        int indOne = -1, indTwo = -1;
        for(int i = nums.length -2; i>=0; i--){
            if(nums[i] < nums[i+1]){
                indOne = i;
                break;
            }
        }
        for(int j = nums.length-1; j>= 0; j--){
            if(indOne != -1 && nums[j] > nums[indOne]){
                indTwo = j;
                break;
            }
        }
        if(indOne != -1){
            swap(nums,indOne,indTwo);
        }
        reverse(nums,indOne+1);
                                                                            
        
    }
    public void reverse(int[] nums, int start){
        int i = start;
        int j = nums.length-1;
        while(i<=j){
            swap(nums,i,j);
            i++; j--;
        }
        
    }
    public void swap(int arr[], int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
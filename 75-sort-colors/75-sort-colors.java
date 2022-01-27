class Solution {
    public void sortColors(int[] arr) {
        int n = arr.length;
         int low = 0, mid =0,high =n-1;
        while(mid<=high){
            if(arr[mid]==0)
               swap(arr,mid++,low++);
            
            else if(arr[mid]==1)
               mid++; 
           else
              
               swap(arr,mid,high--);
        }
           
    }
    public static void swap(int[] a,int i,int j){
        int temp  = a[i];
             a[i] = a[j];
             a[j] = temp;
    }
        
    
}
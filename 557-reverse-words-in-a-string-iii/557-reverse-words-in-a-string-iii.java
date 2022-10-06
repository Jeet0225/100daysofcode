class Solution {
    public String reverseWords(String s) {
        
         int i =0;
        char[] arr = s.toCharArray(); 
        
        for(int j=0;j<arr.length;j++){
            
            if(arr[j]==' '){
                
                reverse(i,j-1,arr);
                
                i = j+1;
                
            }else if(j==arr.length-1){
                reverse(i,j,arr);
            }
        }
        return new String(arr);
    }
    private void reverse(int i,int j, char[] arr){
        while(i<j){
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    }

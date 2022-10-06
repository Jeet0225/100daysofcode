class Solution {
    public String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();
        
        for(int i = 0; i<arr.length; i++){
            if(i+k-1 >= arr.length) reverse(arr,i,arr.length-1);
            reverse(arr,i,i+k-1);
            i = i+k+k-1;
        }
        return String.valueOf(arr);
    }
    public void reverse(char[] s,int low,int high){
          while(high<s.length && low<high){
            char temp = s[high];
            s[high] = s[low];
            s[low] = temp;
             low++;
            high--;

        }
    }
}
// { Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            new Solution().rearrange(arr, n);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java




class Solution {
    void rearrange(int arr[], int n) {
        // code here
       int[] pos = new int[n];
       int[] neg = new int[n];
       int[] res = new int[n];
       for(int i = 0; i<n; i++){
           res[i] = arr[i];
       }
       for(int i=0; i<n; i++){
           pos[i] = Integer.MAX_VALUE;
           neg[i] = Integer.MAX_VALUE;
       }
       int j=0,k=0;
       for(int i=0; i<n; i++){
           if(arr[i] < 0){
               neg[j]=arr[i];
               j++;
           }else{
               pos[k]=arr[i];
               k++;
           }
       }
        j=0;
        k=0;
        boolean isInside = false;
        int i = 0;
       for(i=0; i<n; i++){
           isInside = false;
           if(i%2==0 && pos[k] != Integer.MAX_VALUE){
               arr[i]=pos[k];
               k++;
               isInside = true;
           }else if(neg[j] != Integer.MAX_VALUE){
               arr[i]=neg[j];
               j++;
               isInside = true;
           }
           if(isInside== false)
            break;
       }
       if(i != n){
               while(i <n && pos[k] != Integer.MAX_VALUE){
                   arr[i] = pos[k];
                   i++;
                   k++;
               }
               while(i <n && neg[j] != Integer.MAX_VALUE){
                   arr[i] = neg[j];
                   i++;
                   j++;
               }
       }
        
    }
}
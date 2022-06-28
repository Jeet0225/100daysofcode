// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Geeks
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n =sc.nextInt();
            int arr[] = new int[n];
            
            for(int i = 0; i < n; i++)
             arr[i] = sc.nextInt();
             
           System.out.println(new Solution().majorityElement(arr, n)); 
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution
{
    static int majorityElement(int[] a, int n)
    {
           int count = 1,maj = 0;
        for(int i = 1;i<n;i++){
            if(a[i]==a[maj]){
                count++;
            }
            else if(count==0){
                maj = i;
                count++;
            }
           
            else{
                count--;
            }
        }
        int c=0;
        for(int i=0;i<n;i++){
            if(a[i] == a[maj]){
                c++;
            }
        }
        if(c>n/2){
            return a[maj];
        }
        else{
          return -1;  
        }
    }
}
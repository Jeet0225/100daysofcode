// { Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class gfg
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n =sc.nextInt();
            int a[] = new int[n];
            
            int i = 0;
            for(i = 0; i < n; i++)
              a[i] = sc.nextInt();
              
            int[] s = new Solution().calculateSpan(a, n);
            
            for(i = 0; i < n; i++)
            {
                System.out.print(s[i] + " ");
            }
            
            System.out.println();
        }
    }
    
    
    
}// } Driver Code Ends



class Solution
{
    //Function to calculate the span of stockâ€™s price for all n days.
    public static int[] calculateSpan(int price[], int n)
    {
        
         int ans[]=new int[n];
         ArrayDeque<Integer> a=new ArrayDeque<>();
           a.add(0);ans[0]=1;
           for(int i=0;i<n;i++){
               int c=0;
               while(!a.isEmpty()&&price[a.peek()]<=price[i]){
                   a.pop();
               }
           int span=a.isEmpty()?i+1:i-a.peek();
           ans[i]=span;
           a.push(i);
       }
       return ans;
    }
    
}
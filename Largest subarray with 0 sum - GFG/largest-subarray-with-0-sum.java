// { Driver Code Starts
import java.util.*;

class MaxLenZeroSumSub
{

    // Returns length of the maximum length subarray with 0 sum

    // Drive method
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();

            GfG g = new GfG();
            System.out.println(g.maxLen(arr, n));
            T--;
        }
    }
}// } Driver Code Ends


class GfG
{
    int maxLen(int arr[], int n)
    {
    
          HashMap<Integer, Integer> hash = new HashMap<>();
              int sum =0;
              int index =1;
              int maxDist =0;
              hash.put(sum,index);
              for (int i=0; i<arr.length; i++)
              {
                  sum = sum+arr[i];
                  index = index+1;
                  if(hash.containsKey(sum))
                  {
                      if(index-hash.get(sum)>maxDist)
                      {
                          maxDist = index-hash.get(sum);
                      }
                  }
                  else
                  {
                       hash.put(sum, index);
                  }
              }
              return maxDist;
            }
}
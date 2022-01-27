class Solution {
    public int longestConsecutive(int[] arr) {
        
        int N = arr.length;
        if(N == 0)return 0;
         HashSet<Integer> set = new HashSet<>();
	  
	   for(int i=0; i<N; i++){
	        set.add(arr[i]);
	   }
	       int res = 1;  
	     for(int i=0; i<N; i++) 
	        if(!set.contains(arr[i]-1)){
	     
	   
	        int count = 1;
	        int num = 1;
	     
	       while(set.contains(arr[i]+num)){
	         count++;
	         num++;
	         
	   res = Math.max(count,res);
	       }
	        }
	   	return res;
	
    }
}
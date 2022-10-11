class Solution {
    public boolean increasingTriplet(int[] nums) {
        
        int smallest = Integer.MAX_VALUE;
          int middle = Integer.MAX_VALUE;
        
        for(int i : nums){
            
            if(i<=smallest){
                
                smallest = i;
                
            }else if(i<= middle){
                
                middle = i;
                
            }else {
                
                return true;
            }
        }
        return false;
    }
}
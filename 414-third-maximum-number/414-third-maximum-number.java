class Solution {
    public int thirdMax(int[] nums) {
         long max = Long.MIN_VALUE;
        long secondMax = Long.MIN_VALUE;
        long thirdMax = Long.MIN_VALUE;
        
        for(int i = 0; i < nums.length; i++) {
          
          if(nums[i] > max) {
            thirdMax = secondMax;
            secondMax = max;
            max = nums[i];
          }
          else if(nums[i] > secondMax && max > nums[i]) {
            thirdMax = secondMax;
            secondMax = nums[i];
          }
          else if(nums[i] > thirdMax && secondMax > nums[i]) {
            thirdMax = nums[i];
          }
        }
        return (int)(thirdMax == Long.MIN_VALUE ?  max : thirdMax);
    }
}
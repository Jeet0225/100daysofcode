class Solution {
    public int smallestRangeII(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int largest = nums[n-1]-k;
        int smallest = nums[0]+k;
        int ans = nums[n-1]-nums[0];
        
        for(int i=0; i<n-1; i++){
            
            int min = Math.min(smallest, nums[i+1]-k);
            int max = Math.max(largest, nums[i]+k);
            
            ans = Math.min(ans,max-min);
            
        }
        return ans;
    }
}
class Solution {
    public int pivotIndex(int[] nums) {
        
        int lsum = 0, rsum = 0;
		for (int i=1; i < nums.length; i++) {
			rsum += nums[i];
		}
		if (rsum== 0) return 0;

		for (int i = 1; i < nums.length; i++) {
			lsum += nums[i - 1];
			rsum -= nums[i];
			if (lsum == rsum) return i;
		}
		return -1;
    }
}
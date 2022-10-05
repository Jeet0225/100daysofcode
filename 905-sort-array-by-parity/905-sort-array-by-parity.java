class Solution {
    public int[] sortArrayByParity(int[] nums) {
        
        int p = 0, q = nums.length - 1;

        while (p < q) {
            
            if (nums[p] % 2 != 0 && nums[q] % 2 == 0) {
                
                int temp = nums[p];
                nums[p++] = nums[q];
                nums[q--] = temp;
            } else if (nums[p] % 2 == 0) {
                p += 1;
            } else {
                q -= 1;
            }
        }

        return nums;
    }
}
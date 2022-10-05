class Solution {
    public List<String> summaryRanges(int[] nums) {
        int n = nums.length;
        List<String> res = new ArrayList<>();
        
        if (n == 0) return res;
        int a = nums[0];
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] + 1 != nums[i + 1]) {
                // current i is the end of of range
                res.add(a + (a == nums[i] ? "" : ("->" + nums[i])));
                a = nums[i + 1];
            } 

        }
        res.add(a + ((a == nums[n - 1]) ? "" : ("->" + nums[n - 1])));
        return res;
    }
}
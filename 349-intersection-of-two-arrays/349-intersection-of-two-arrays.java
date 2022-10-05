class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        int n = nums1.length;
        int m = nums2.length;
        
        Set<Integer> map = new HashSet<>();
        int i=0,j=0, k= 0;
        while(i<n && j<m){
            if(nums1[i]>nums2[j])j++;
            else if(nums1[i]<nums2[j])i++;
            else{
                map.add(nums1[i]);
                i++;
                j++;
            }
        }
        int[] result = new int[map.size()];
        
        for(Integer in : map) result[k++] = in;
	      
	return result;
    }
}
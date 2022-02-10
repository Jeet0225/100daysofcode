class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        ArrayList<List<Integer>> res = new ArrayList<List<Integer>>();
         if(nums==null || nums.length==0)
             return res;
          int n = nums.length; 
          Arrays.sort(nums);
        
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                
              int target_2 = target-nums[j]-nums[i];
                 int left = j+1;
                int right = n-1;
                while(left<right){
                    
              int two_sum = nums[left]+nums[right];
               
                if( two_sum< target_2)left++;
                else if(two_sum > target_2)right--;
                    else{
                        List<Integer>quad = new ArrayList<>();
                        quad.add(nums[i]);
                        quad.add(nums[j]);
                        quad.add(nums[left]);
                        quad.add(nums[right]);
                        res.add(quad);
                        
                while(left<right && nums[left] == quad.get(2))++left;
                 while(left<right && nums[right] == quad.get(3))--right;
                    }
                }  
                while(j+1<n && nums[j+1] == nums[j])++j;
               }
                while(i+1<n && nums[i+1] == nums[i])++i;                                        
              }
              return res;
    }
}
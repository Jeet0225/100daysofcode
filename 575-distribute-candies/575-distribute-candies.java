class Solution {
    public int distributeCandies(int[] candyType) {
        
        int k = candyType.length;
        
        Set <Integer> set = new HashSet<>();
        
            for(int i : candyType){
               set.add(i);
            }
            return Math.min(set.size(),k/2);
      }
    }

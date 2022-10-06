class Solution {
    public int countSegments(String s) {
        
        int count = 0;
        
        String[] input = s.split("\\s+");
    
        for(String s1 : input)
        {
            if(!s1.isEmpty())
                count++;
        }
      return count;
        
    }
}
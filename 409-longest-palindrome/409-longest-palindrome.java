class Solution {
    public int longestPalindrome(String s) {
        
            int count = 0;
        
   HashMap<Character,Integer> map = new HashMap<>();
        
        for(int i=0;i<s.length();i++)
            
        if(map.containsKey(s.charAt(i))) 
            
            map.put(s.charAt(i),map.get(s.charAt(i))+1);
        
            else map.put(s.charAt(i),1);
        
               for(Integer i:map.values())
                   
                 if(i%2==1)
                     
                  count++;
        
             if(count>0) return s.length()-count+1;
               else return s.length();
    }
}
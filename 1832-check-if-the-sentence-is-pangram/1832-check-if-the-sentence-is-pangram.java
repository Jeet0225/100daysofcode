class Solution {
    public boolean checkIfPangram(String s) {
        
       int [] res = new int[26];
        
            for(int i=0; i<s.length(); i++){
                
                res[s.charAt(i)-'a']++;
            }
              for(int i=0; i<26; i++){
                
                if(res[i]==0){
                    
                    return false;
                }
            }
      return true;
    }
}
class Solution {
    public boolean isSubsequence(String s, String t) {
        
        if(s.length() > t.length())return false;
        if(s.length() == 0)return true;
        
        int count = 0;
        
        for(int i=0; i<t.length(); i++){
            
            if(s.charAt(count)== t.charAt(i)){
                 count++;
            }
             if(s.length()==count)  
                 return true;
            
        }
        return false;
    }
    
}
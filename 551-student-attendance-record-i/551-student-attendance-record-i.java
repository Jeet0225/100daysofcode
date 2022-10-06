class Solution {
    public boolean checkRecord(String s) {
        
               int count=0;
        
        for(int i=0;i<s.length();i++){
            
            if(i>0 && i<s.length()-1){
                
                if(s.charAt(i)=='L' && s.charAt(i-1)=='L'&& s.charAt(i+1)=='L')
                    
                    return false;
            }
            if(s.charAt(i)=='A'){
                count++;
            }
        }
        return count<2;
 
    }
}
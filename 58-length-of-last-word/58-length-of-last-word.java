class Solution {
    public int lengthOfLastWord(String s) {
        
        s = s.trim(); // space ko hta dega 
        
        int i=s.length()-1;
        
        int count=0;
        
        while(s.charAt(i)!=' '){
            i--;
            count++;
            
            if(i<0){
                
                break;
            }
        }
        return count;
    }
}
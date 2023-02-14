class Solution {
    public String addBinary(String a, String b) {
        
          String s = "";
    

    int c = 0, i = a.length() - 1, j = b.length() - 1;
	
	
    while(i >= 0 || j >= 0 || c == 1)
    {  
        c += i >= 0 ? a.charAt(i--) - '0' : 0;
        c += j >= 0 ? b.charAt(j--) - '0' : 0; 
        s = (char)(c % 2 + '0') + s;
		
		
        c /= 2;
    }
    
    return s;
    }
}
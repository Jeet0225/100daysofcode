class Solution {
    public String removeOuterParentheses(String s) {
        
        StringBuilder stb = new StringBuilder();
        int bracket = 0;
        
        for(int i=0; i<s.length(); i++){
            
            if(s.charAt(i) == '('){
                bracket++;
            }
            
            if(bracket>1){
                stb.append(s.charAt(i));
            }
            
            if(s.charAt(i)==')'){
                bracket--;
            }
        }
        return stb.toString();
    }
}
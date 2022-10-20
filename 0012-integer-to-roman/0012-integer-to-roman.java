class Solution {
    public String intToRoman(int num) {
        
        int[] roman = {1000,900,500,400,100,90,50,40,10,9,5,4,1}; 
        
        String[] str = {"M", "CM", "D","CD","C","XC","L","XL","X","IX","V","IV","I"};  
        
        StringBuilder str2 = new StringBuilder();
        
            for(int i = 0; i<roman.length; i++){

                while(num >= roman[i]){

                    str2.append(str[i]);

                    num -= roman[i];
                }
            }
        return str2.toString();

    }
}
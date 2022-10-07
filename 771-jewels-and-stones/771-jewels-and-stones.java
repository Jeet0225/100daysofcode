class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        
        int c = 0;
        
        ArrayList<Character> a = new ArrayList<Character>();
        
            for(int i=0; i<jewels.length(); i++)
            {
                a.add(jewels.charAt(i));
            }
            for(int i=0; i<stones.length(); i++)
            {
                if(a.contains(stones.charAt(i)))
                {
                    c=c+1;
                }
            }
        return c;
    }
}
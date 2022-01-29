class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        for(int i=1; i<=numRows; i++){
            List<Integer> list = new ArrayList<Integer>();
            list.add(1);
            for(int j = 1; j<i; j++){
                if(i>=3 && j>1){
                    List<Integer> lastlist = res.get(i-2);
                    list.add(lastlist.get(j-1) + lastlist.get(j-2));
                }
            }
            if(i!= 1) list.add(1);
            res.add(list);
        }
        return res;  
    }
}
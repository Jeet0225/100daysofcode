class Solution {
    public List<Integer> getRow(int rowIndex) {
        List <Integer> arr = new ArrayList<>();
            long NCR=1;
            for(int i=0;i<=rowIndex;i++){
            arr.add((int)NCR);
            long NCRQ=NCR*(rowIndex-i)/(i+1);
            NCR=NCRQ;
            }
            return arr;
    }
}
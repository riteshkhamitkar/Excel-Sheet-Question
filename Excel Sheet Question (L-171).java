class Solution {
    public int titleToNumber(String s) {
        int res =0;
        for(int i: s.toCharArray()){
            res = res*26+(i-'A'+1);
        }
        return res;
    }
}
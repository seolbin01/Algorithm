class Solution {
    public int solution(int num, int k) {
        String numStr = String.valueOf(num);
        String kStr = String.valueOf(k);
        
        int index = numStr.indexOf(kStr);
        
        if (index == -1) {
            return -1;
        } else {
            return index + 1;
        }
    }
}

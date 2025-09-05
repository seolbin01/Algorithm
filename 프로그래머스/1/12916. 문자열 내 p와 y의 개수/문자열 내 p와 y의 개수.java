class Solution {
    boolean solution(String s) {
        
        s = s.toLowerCase();

        int countP = 0;
        int countY = 0;

        for (char c : s.toCharArray()) {
            if (c == 'p') countP++;
            else if (c == 'y') countY++;
        }
        
        return countP == countY;
    }
}

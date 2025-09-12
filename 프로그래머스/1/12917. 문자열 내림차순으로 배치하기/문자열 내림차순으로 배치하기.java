import java.util.*;

class Solution {
    public String solution(String s) {
        char[] carr = s.toCharArray();
        
        Arrays.sort(carr);
        
        StringBuilder answer = new StringBuilder(new String(carr)).reverse();
        return answer.toString();
    }
}
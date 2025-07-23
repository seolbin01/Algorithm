import java.util.*;

class Solution {
    public String solution(String my_string) {
        my_string = my_string.toLowerCase();
        
        char[] carr = my_string.toCharArray();
        Arrays.sort(carr);
        
        String answer = new String(carr);
        
        return answer;
    }
}

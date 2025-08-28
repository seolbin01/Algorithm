import java.util.*;

class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        
        Arrays.sort(spell);
        
        String sp = "";
        for (String s : spell) {
            sp += s;
        }
        
        for (String s : dic) {
            char[] carr = s.toCharArray();
            Arrays.sort(carr);
            String str = new String(carr);
            
            if (sp.equals(str)) {
                answer = 1;
                break;
            }
        }
        
        return answer;
    }
}
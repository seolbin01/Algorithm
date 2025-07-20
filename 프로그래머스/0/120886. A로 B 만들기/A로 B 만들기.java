import java.util.*;

class Solution {
    public int solution(String before, String after) {
        HashMap<Character, Integer> hmap = new HashMap<>();
        
        for (int i=0;i<before.length();i++) {
            char bc = before.charAt(i);
            hmap.put(bc, hmap.getOrDefault(bc, 0) + 1);
        }
        
        for (int i=0;i<after.length();i++) {
            char ac = after.charAt(i);
            
            if (!hmap.containsKey(ac) || hmap.get(ac) == 0) {
                return 0;
            }
        
            hmap.put(ac, hmap.get(ac) - 1);
        }
        
        return 1;
    }
}
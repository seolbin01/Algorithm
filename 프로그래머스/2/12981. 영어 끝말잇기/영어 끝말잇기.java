import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];

        HashMap<String, Integer> strmap = new HashMap<>();
        
        int ansindex = -1;
        String past = words[0];
        strmap.put(words[0], 0);
        
        for (int i=1;i<words.length;i++) {
            String current = words[i];
            if (strmap.get(current) != null || 
                past.charAt(past.length() - 1) != current.charAt(0)) {
                ansindex = i;
                break;
            } else {
                strmap.put(current, 0);
                past = current;
            }
        }
        
        if (ansindex == -1) {
            answer[0] = 0;
            answer[1] = 0;
        } else {
            answer[0] = ansindex % n + 1;
            answer[1] = ansindex / n + 1;
        }

        return answer;
    }
}
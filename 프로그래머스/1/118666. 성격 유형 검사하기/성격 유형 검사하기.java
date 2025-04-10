import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        StringBuilder answer = new StringBuilder();
        
        Map<Character, Integer> score = new HashMap<>();
        
        for (char c : new char[]{'R', 'T', 'C', 'F', 'J', 'M', 'A', 'N'}) {
            score.put(c, 0);
        }
        
        for (int i=0;i<survey.length;i++) {
            char left = survey[i].charAt(0);
            char right = survey[i].charAt(1);
            int choice = choices[i];

            if (choice < 4) { // 왼쪽
                score.put(left, score.get(left) + (4 - choice));
            } else if (choice > 4) { // 오른쪽
                score.put(right, score.get(right) + (choice - 4));
            }
        }
        
        answer.append(score.get('R') >= score.get('T') ? 'R' : 'T');
        answer.append(score.get('C') >= score.get('F') ? 'C' : 'F');
        answer.append(score.get('J') >= score.get('M') ? 'J' : 'M');
        answer.append(score.get('A') >= score.get('N') ? 'A' : 'N');
        
        return answer.toString();
    }
}
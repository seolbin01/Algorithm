import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        int[] one = {1, 2, 3, 4, 5};
        int[] two = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int oneScore = 0;
        int twoScore = 0;
        int threeScore = 0;
        
        for (int i=0;i<answers.length;i++) {
            if (one[i%5] == answers[i]) {
                oneScore++;
            }
            if (two[i%8] == answers[i]) {
                twoScore++;
            }
            if (three[i%10] == answers[i]) {
                threeScore++;
            }
        }
        
        int max = oneScore;
        max = Math.max(max, twoScore);
        max = Math.max(max, threeScore);
        
        if (max == oneScore) answer.add(1);
        if (max == twoScore) answer.add(2);
        if (max == threeScore) answer.add(3);
        
        return answer.stream().mapToInt(i->i).toArray();
    }
}
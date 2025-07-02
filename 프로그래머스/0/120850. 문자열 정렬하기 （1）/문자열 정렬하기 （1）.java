import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        List<Integer> answer = new LinkedList<>();
        
        for (char c : my_string.toCharArray()) {
            if (Character.isDigit(c)) {
                answer.add(c - '0');
            }
        }
        
        return answer.stream()
                     .sorted()
                     .mapToInt(i->i)
                     .toArray();
    }
}
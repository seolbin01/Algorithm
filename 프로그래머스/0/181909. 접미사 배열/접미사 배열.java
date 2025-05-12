import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        List<String> answer = new LinkedList<>();
        
        for (int i=0;i<my_string.length();i++) {
            answer.add(my_string.substring(i));
        }
        
        return answer.stream()
                     .sorted()
                     .toArray(String[]::new);
    }
}
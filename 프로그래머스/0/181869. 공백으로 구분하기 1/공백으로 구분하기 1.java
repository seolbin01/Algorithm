import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        List<String> answer = new LinkedList<>();
        
        StringTokenizer st = new StringTokenizer(my_string);

        while (st.hasMoreTokens()) {
            answer.add(st.nextToken());
        }
        
        return answer.toArray(String[]::new);
    }
}
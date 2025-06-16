import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        String[] list = myStr.split("[abc]");
        List<String> answer = new LinkedList<>();
        
        for (String s : list) {
            if (!s.equals("")) {
                answer.add(s);
            }
        }
        
        if (answer.isEmpty()) {
            answer.add("EMPTY");
        }
        
        return answer.toArray(new String[0]);
    }
}
import java.util.*;

class Solution {
    public int solution(String s) {
        int n = s.length();
        int answer = 0;

        for (int x = 0; x < n; x++) {
            Deque<Character> stack = new ArrayDeque<>();
            boolean valid = true;

            for (int i = 0; i < n; i++) {
                char c = s.charAt((x + i) % n);

                if (c == '(' || c == '[' || c == '{') {
                    stack.push(c);
                } else {
                    if (stack.isEmpty()) {
                        valid = false;
                        break;
                    }

                    char top = stack.pop();
                    if (c == ')' && top != '(') { valid = false; break; }
                    if (c == ']' && top != '[') { valid = false; break; }
                    if (c == '}' && top != '{') { valid = false; break; }
                }
            }

            if (valid && stack.isEmpty()) {
                answer++;
            }
        }

        return answer;
    }
}

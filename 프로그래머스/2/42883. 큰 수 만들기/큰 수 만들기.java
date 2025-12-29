import java.util.*;

class Solution {
    public String solution(String number, int k) {
        Deque<Character> stack = new ArrayDeque<>();

        for (int i=0;i<number.length();i++) {
            char cur = number.charAt(i);

            while (!stack.isEmpty() && k > 0 && stack.peekLast() < cur) {
                stack.pollLast();
                k--;
            }
            stack.addLast(cur);
        }

        while (k > 0) {
            stack.pollLast();
            k--;
        }

        StringBuilder sb = new StringBuilder(stack.size());
        for (char c : stack) {
            sb.append(c);
        }
        return sb.toString();
    }
}

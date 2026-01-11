import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        int n = prices.length;
        int[] answer = new int[n];

        ArrayDeque<Integer> dq = new ArrayDeque<>();

        for (int i=0;i<n;i++) {
            while (!dq.isEmpty() && prices[dq.peekLast()] > prices[i]) {
                int idx = dq.pollLast();
                answer[idx] = i - idx;
            }
            dq.addLast(i);
        }

        while (!dq.isEmpty()) {
            int idx = dq.pollLast();
            answer[idx] = n-1-idx;
        }

        return answer;
    }
}

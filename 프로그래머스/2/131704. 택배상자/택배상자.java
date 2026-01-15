import java.util.*;

class Solution {
    public int solution(int[] order) {
        Stack<Integer> sub = new Stack<>();
        int cur = 1;
        int idx = 0;
        int n = order.length;

        while (true) {
            if (cur <= n && order[idx] == cur) {
                cur++;
                idx++;
            } else if (!sub.isEmpty() && sub.peek() == order[idx]) {
                sub.pop();
                idx++;
            } else if (cur <= n) {
                sub.push(cur);
                cur++;
            } else {
                break;
            }

            if (idx == n) break;
        }

        return idx;
    }
}

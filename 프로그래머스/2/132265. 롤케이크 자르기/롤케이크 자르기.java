import java.util.*;

class Solution {
    public int solution(int[] topping) {
        int answer = 0;

        Map<Integer, Integer> right = new HashMap<>();
        for (int t : topping) {
            right.put(t, right.getOrDefault(t, 0) + 1);
        }

        Set<Integer> left = new HashSet<>();

        for (int i = 0; i < topping.length - 1; i++) {
            int cur = topping[i];

            right.put(cur, right.get(cur) - 1);
            if (right.get(cur) == 0) {
                right.remove(cur);
            }

            left.add(cur);

            if (left.size() == right.size()) {
                answer++;
            }
        }

        return answer;
    }
}
import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;

        Map<String, Integer> wantMap = new HashMap<>();
        for (int i = 0; i < want.length; i++) {
            wantMap.put(want[i], number[i]);
        }

        Map<String, Integer> windowMap = new HashMap<>();

        for (int i = 0; i < 10; i++) {
            windowMap.put(discount[i], windowMap.getOrDefault(discount[i], 0) + 1);
        }

        if (isSame(wantMap, windowMap)) {
            answer++;
        }

        for (int i = 10; i < discount.length; i++) {
            String remove = discount[i - 10];
            String add = discount[i];

            windowMap.put(remove, windowMap.get(remove) - 1);
            if (windowMap.get(remove) == 0) {
                windowMap.remove(remove);
            }

            windowMap.put(add, windowMap.getOrDefault(add, 0) + 1);

            if (isSame(wantMap, windowMap)) {
                answer++;
            }
        }

        return answer;
    }

    private boolean isSame(Map<String, Integer> wantMap, Map<String, Integer> windowMap) {
        for (String key : wantMap.keySet()) {
            if (windowMap.getOrDefault(key, 0) != wantMap.get(key)) {
                return false;
            }
        }
        return true;
    }
}

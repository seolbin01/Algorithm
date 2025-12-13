import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        
        Map<Integer, Integer> hm = new HashMap<>();
        for (int t : tangerine) {
            hm.put(t, hm.getOrDefault(t, 0) + 1);
        }
        
        List<Integer> count = new ArrayList<>(hm.values());
        count.sort(Comparator.reverseOrder());

        int sum = 0;
        int typeCount = 0;

        for (int c : count) {
            sum += c;
            answer++;
            if (sum >= k) {
                break;
            }
        }
        
        return answer;
    }
}
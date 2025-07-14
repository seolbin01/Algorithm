import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        
        int len = emergency.length;
        
        int[] answer = new int[len];
        
        int[] sortarr = Arrays.copyOf(emergency, len);
        Arrays.sort(sortarr);
        
        Map<Integer, Integer> rankMap = new HashMap<>();
        for (int i=len-1;i>=0;i--) {
            rankMap.put(sortarr[i], len - i);
        }

        for (int i=0;i<len;i++) {
            answer[i] = rankMap.get(emergency[i]);
        }

        return answer;
    }
}

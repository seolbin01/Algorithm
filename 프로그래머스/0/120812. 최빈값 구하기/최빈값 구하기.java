import java.util.*;

class Solution {
    public int solution(int[] array) {
        Map<Integer, Integer> countMap = new HashMap<>();
        
        for (int num : array) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        int maxCount = 0;
        int mode = -1;
        boolean isDuplicate = false;

        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();

            if (value > maxCount) {
                maxCount = value;
                mode = key;
                isDuplicate = false;
            } else if (value == maxCount) {
                isDuplicate = true;
            }
        }

        return isDuplicate ? -1 : mode;
    }
}

import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        int answer = array[0];
        int min = Math.abs(array[0] - n);

        for (int i : array) {
            int diff = Math.abs(i - n);
            if (diff < min || (diff == min && i < answer)) {
                min = diff;
                answer = i;
            }
        }

        return answer;
    }
}

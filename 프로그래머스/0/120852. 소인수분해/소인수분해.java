import java.util.*;

class Solution {
    public int[] solution(int n) {
        Set<Integer> answer = new TreeSet<>();
        
        int i = 2;
        while (i != n) {
            if (n % i == 0) {
                answer.add(i);
                n /= i;
                i = 2;
            } else {
                i++;
            }
        }
        
        if (n > 1) {
            answer.add(n);
        }
        
        return answer.stream().mapToInt(a->a).toArray();
    }
}
import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> answer = new LinkedList<>();
        
        int a = 1;
        while (a != n) {
            if (n % a == 0) {
                answer.add(a);
            }
            a++;
        }
        answer.add(a);
        
        return answer.stream().mapToInt(i->i).toArray();
    }
}
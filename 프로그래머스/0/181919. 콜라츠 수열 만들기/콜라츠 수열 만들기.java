import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> answer = new LinkedList<>();
        answer.add(n);
        
        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = n * 3 + 1; 
            }
            
            answer.add(n);
        }
        
        return answer.stream().mapToInt(i->i).toArray();
    }
}
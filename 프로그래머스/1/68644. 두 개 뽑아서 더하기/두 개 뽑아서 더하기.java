import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> sumset = new HashSet<>();
        
        for (int i=0;i<numbers.length-1;i++) {
            for (int j=i+1;j<numbers.length;j++) {
                sumset.add(numbers[i] + numbers[j]);
            }
        }
        
        int[] answer = sumset.stream().mapToInt(i->i).toArray();
        Arrays.sort(answer);
        
        return answer;
    }
}
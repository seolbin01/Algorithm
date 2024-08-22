import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();
            
        Queue<Integer> q = new LinkedList<>();
        
        for(int i=0;i<progresses.length;i++) {
            int days = (100 - progresses[i]) / speeds[i];
            if((100 - progresses[i]) % speeds[i] != 0) {
                days++;
            }
            
            q.offer(days);
        }
        
        int count = 1;
        int max = q.poll();
        while(!q.isEmpty()){
            int cur = q.poll();
            if(cur > max) {
                answer.add(count);
                count = 1;
                max = cur;
                continue;
            }
            count++;
        }
        answer.add(count);
        
        
        return answer.stream().mapToInt(i -> i).toArray();
    }
}
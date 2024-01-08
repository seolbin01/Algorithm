import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answerlist = new ArrayList<>();
        
        Queue<Integer> qProg = new LinkedList<>();
        Queue<Integer> qSped = new LinkedList<>();
        
        for(int i : progresses) qProg.offer(i);
        for(int i : speeds) qSped.offer(i);
        
        int days = 1;
        int num = 0;
        while(!qProg.isEmpty()){
            
            while(qProg.peek() + days*qSped.peek() >= 100){
                qProg.poll();
                qSped.poll();
                num++;
                
                if (qProg.isEmpty()) break;
            }
            
            if(num != 0){
                answerlist.add(num);
                num = 0;
            }
            
            days++;
        }
        
        int[] answer = answerlist.stream().mapToInt(Integer::intValue).toArray();
        
        return answer;
    }
}
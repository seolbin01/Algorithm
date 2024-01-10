import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        Queue<Integer> q = new LinkedList<>();
        int curwei = 0;
        
        for(int i : truck_weights){
            
            while(true){
                
                if(q.isEmpty()){
                    q.offer(i);
                    curwei += i;
                    answer++;
                    break;
                }
                else if(q.size() == bridge_length){
                    curwei -= q.poll();
                }
                else{
                    if(curwei + i > weight){
                        q.offer(0);
                        answer++;
                    }
                    else{
                        q.offer(i);
                        curwei += i;
                        answer++;
                        break;
                    }
                }
            }
        }
        
        return answer + bridge_length;
    }
}
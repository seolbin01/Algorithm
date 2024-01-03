import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        
        Queue<Integer> q = new LinkedList<>();
        
        int tmp = -1;
        for(int i=0;i<arr.length;i++){
            if(tmp != arr[i]) q.offer(arr[i]);
            tmp = arr[i];
        } 
        
        int[] answer = new int[q.size()];
        
        int i = 0;
        while (!q.isEmpty()) {
            answer[i++] = q.poll();
        }
        
        return answer;
    }
}
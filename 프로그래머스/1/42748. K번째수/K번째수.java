import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        int i,j,k;
        for(int a=0;a<commands.length;a++){
            i = commands[a][0] - 1;
            j = commands[a][1] - 1;
            k = commands[a][2] - 1;
            
            int[] tmp = Arrays.copyOfRange(array, i, j + 1);
            Arrays.sort(tmp);
            
            answer[a] = tmp[k];
        }
        
        return answer;
    }
}
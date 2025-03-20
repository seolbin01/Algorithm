import java.lang.*;

class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        
        int up = (numer1 * denom2) + (numer2 * denom1);
        int down = denom1 * denom2;
        
        int start = Math.max(up, down);
        
        for (int i=start;i>0;i--) {
            if (down % i == 0 && up % i == 0) {
                up /= i;
                down /= i;
            }
        }
    
        answer[0] = up;
        answer[1] = down;
        
        return answer;
    }
}
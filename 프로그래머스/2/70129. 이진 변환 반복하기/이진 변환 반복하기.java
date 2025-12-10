import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        
        int count = 0;
        int total = 0;
        
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        while (!sb.toString().equals("1")) {
            int curLen = sb.length();
            int afterLen = sb.toString().replace("0", "").length();

            total += curLen - afterLen;
            count++;
            
            sb.setLength(0);
            sb.append(Integer.toBinaryString(afterLen));
            
        }
        
        answer[0] = count;
        answer[1] = total;
        
        return answer;
    }
}
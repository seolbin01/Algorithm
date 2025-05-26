class Solution {
    public String solution(int[] numLog) {
        StringBuilder answer = new StringBuilder();
        
        int past = numLog[0];
        
        for (int i=1;i<numLog.length;i++) {
            int cur = numLog[i] - past;
            
            if (cur == 1) {
                answer.append("w");
            } else if (cur == -1) {
                answer.append("s");
            } else if (cur == 10) {
                answer.append("d");
            } else if (cur == -10) {
                answer.append("a");
            }
            
            past = numLog[i];
        }
        
        return answer.toString();
    }
}
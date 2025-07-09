class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
        
        while (true) {
            answer++;
            if (slice * answer >= n) {
                break;
            }
        }
        
        return answer;
    }
}
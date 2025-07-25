class Solution {
    public int solution(int order) {
        int answer = 0;
        
        while (order > 0) {
            int cur = order % 10;
            
            if (cur == 3 || cur == 6 || cur == 9) {
                answer++;
            }
            
            order = order / 10;
        }
        
        return answer;
    }
}
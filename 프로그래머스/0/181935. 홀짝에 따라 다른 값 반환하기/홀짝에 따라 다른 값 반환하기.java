class Solution {
    public int solution(int n) {
        int answer = 0;
        
        if (n % 2 != 0) {
            answer = (n + 1) * (n + 1) / 4;
        } else {
            for (int i=2;i<=n;i+=2) {
                answer += i * i;
            }
        }
        
        return answer;
    }
}
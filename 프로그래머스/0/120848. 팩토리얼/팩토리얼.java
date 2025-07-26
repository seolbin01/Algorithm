class Solution {
    public int solution(int n) {
        int answer = 1;        
        int fac = 1;

        while (fac * (answer + 1) <= n) { 
            answer++;
            fac *= answer;
        }

        return answer;
    }
}

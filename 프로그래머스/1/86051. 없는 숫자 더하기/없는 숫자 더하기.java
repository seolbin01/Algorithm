class Solution {
    public int solution(int[] numbers) {
        int answer = (0 + 9) * 10 / 2;
        
        for (int n : numbers) {
            answer -= n;
        }
        
        return answer;
    }
}
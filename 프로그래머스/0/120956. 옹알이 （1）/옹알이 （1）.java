class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String pattern = "^(aya|ye|woo|ma)+$";

        for (String s : babbling) {
            if (s.matches(pattern)) {
                answer++;
            }
        }
        return answer;
    }
}

class Solution {
    public String solution(int age) {
        StringBuilder answer = new StringBuilder();
        String strAge = String.valueOf(age);
        
        for (char digit : strAge.toCharArray()) {
            answer.append((char) ('a' + (digit - '0')));
        }

        return answer.toString();
    }
}

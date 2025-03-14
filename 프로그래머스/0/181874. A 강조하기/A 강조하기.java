class Solution {
    public String solution(String myString) {
        String answer = myString;
        
        answer = answer.toLowerCase();
        answer = answer.replace("a", "A");
        
        return answer;
    }
}
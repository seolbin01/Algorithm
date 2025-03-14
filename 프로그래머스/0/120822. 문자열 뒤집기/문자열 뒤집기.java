class Solution {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        
        answer.append(my_string);
        answer.reverse();
        
        return answer.toString();
    }
}
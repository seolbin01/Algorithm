class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        
        char[] carr = my_string.toCharArray();
        
        char temp = carr[num1];
        carr[num1] = carr[num2];
        carr[num2] = temp;
        
        answer = new String(carr);
        
        return answer;
    }
}
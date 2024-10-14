class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        
        StringBuilder sb = new StringBuilder();
        
        sb.append(my_string.substring(0, s));
        sb.append(overwrite_string);
        
        if(sb.length() < my_string.length()) {
            int len = my_string.length() - sb.length();
            sb.append(my_string.substring(my_string.length() - len));
        }
        
        answer = sb.toString();
        
        System.out.println(answer);
        
        return answer;
    }
}